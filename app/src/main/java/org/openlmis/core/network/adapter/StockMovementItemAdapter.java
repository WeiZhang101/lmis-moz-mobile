package org.openlmis.core.network.adapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import org.openlmis.core.exceptions.MovementReasonNotFoundException;
import org.openlmis.core.manager.MovementReasonManager;
import org.openlmis.core.model.StockMovementItem;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

public class StockMovementItemAdapter implements JsonDeserializer<StockMovementItem> {

    private final Gson gson;

    public StockMovementItemAdapter() {
        gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new DateAdapter()).setDateFormat(DateFormat.LONG)
                .create();
    }

    @Override
    public StockMovementItem deserialize(JsonElement json, Type typeOfT,
                                         JsonDeserializationContext context) throws JsonParseException {

        StockMovementItem stockMovementItem = gson.fromJson(json, StockMovementItemResponse.class).convertToStockMovementItem();

        String reason = json.getAsJsonObject().get("reason").getAsString();
        try {
            MovementReasonManager.MovementReason movementReason = MovementReasonManager.getInstance().queryByCode(reason);
            stockMovementItem.setMovementType(movementReason.getMovementType());
            stockMovementItem.setReason(movementReason.getCode());
        } catch (MovementReasonNotFoundException e) {
            e.printStackTrace();
        }

        Date createdDate = new Date(json.getAsJsonObject().get("createdDate").getAsLong());
        Date movementDate = new Date(json.getAsJsonObject().get("movementDate").getAsLong());

        stockMovementItem.setCreatedAt(createdDate);
        stockMovementItem.setUpdatedAt(movementDate);

        return stockMovementItem;
    }

    class StockMovementItemResponse extends StockMovementItem{
        Map<String, String> extensions;
        public StockMovementItem convertToStockMovementItem(){
            StockMovementItem movementItem = this;
            if (extensions!=null) {
                this.setExpireDates(extensions.get("expirationdates"));
                this.setSignature(extensions.get("signature"));
            }
            return movementItem;
        }
    }
}