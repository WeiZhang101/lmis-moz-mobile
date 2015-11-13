require 'rubygems'
require 'rest-client'
require 'json'
require 'base64'

WEB_DEV_URI = "52.69.16.156:8000"

def http_basic_auth(username, password)
  auth = Base64.strict_encode64("#{username}:#{password}")
  return "Basic #{auth}"
end