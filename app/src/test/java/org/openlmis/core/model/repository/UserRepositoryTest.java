/*
 * This program is part of the OpenLMIS logistics management information
 * system platform software.
 *
 * Copyright © 2015 ThoughtWorks, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details. You should
 * have received a copy of the GNU Affero General Public License along with
 * this program. If not, see http://www.gnu.org/licenses. For additional
 * information contact info@OpenLMIS.org
 */

package org.openlmis.core.model.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openlmis.core.LMISRepositoryUnitTest;
import org.openlmis.core.LMISTestRunner;
import org.openlmis.core.model.User;
import org.robolectric.RuntimeEnvironment;

import roboguice.RoboGuice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(LMISTestRunner.class)
public class UserRepositoryTest extends LMISRepositoryUnitTest {

    UserRepository userRepository;

    @Before
    public void setup() {
        userRepository = RoboGuice.getInjector(RuntimeEnvironment.application).getInstance(UserRepository.class);
    }


    @Test
    public void shouldSaveUserWithFacilityIdAndCode() {
        User user = new User("user", "123");
        user.setFacilityId("abc");
        user.setFacilityCode("FC1");
        user.setFacilityName("Facility 1");

        userRepository.save(user);
        User userSaved = userRepository.getUserFromLocal(new User("user", "123"));

        assertThat(userSaved, notNullValue());
        assertThat(userSaved.getFacilityCode(), is("FC1"));
        assertThat(userSaved.getFacilityId(), is("abc"));
        assertThat(userSaved.getFacilityName(), is("Facility 1"));
    }
}