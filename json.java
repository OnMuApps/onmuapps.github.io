JSONArray jsonArray = new JSONArray();

//...
JSONObject jsonObject = new JSONObject();
jsonObject.put("key",key);
jsonObject.put("value",value);
jsonArray.put(jsonObject);
//...

String headers = jsonArray.toString();