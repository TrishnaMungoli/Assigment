package com.framework.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonReader {
	
	public static Object[][] getdata(String JSON_path, String typeData, int totalDataRow, int totalColumnEntry) {
		JsonParser jsonParser =  new JsonParser();
		JsonObject jsonObj = null;
		
		try {
			jsonObj = jsonParser.parse(new FileReader(JSON_path)).getAsJsonObject();
		} catch (JsonIOException e) {
			
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		JsonObject obj = (JsonObject) jsonObj.getAsJsonObject(typeData);
        return searchJsonElement(obj, totalDataRow, totalColumnEntry);
	}
	

	
	public static Object[][] searchJsonElement(JsonObject jsonObj, int totalDataRow, int totalColumnEntry) 
	{			
		Object[][] matrix = new Object[totalDataRow][totalColumnEntry];
        int i =0;
        int j = 0;
        for (String jsonElement : jsonObj.keySet()) 
        	
        {
        	String val = jsonObj.get(jsonElement).toString();
            	 matrix[i][j] = val.replace("\"","");
                 j++;   
            }
            i++;
            j = 0;
        
      return matrix;
	}
}
