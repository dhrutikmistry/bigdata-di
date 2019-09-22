package com.myapp.util;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myapp.json.DiConfigRoot;

public class DiConfigJsonParser {

	public static DiConfigRoot getDiConfigRootFromJson(String jsonFilePath) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		try {
			DiConfigRoot diConfigRoot = mapper.readValue(new File(jsonFilePath), DiConfigRoot.class);
			return diConfigRoot;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} 
	}
	public static void main(String[] args) {
		
		try {

			String jsonFilePath = "/Users/kamal/workspace/Json_Ex/di-json-parser/config/di-config.json";
			DiConfigRoot diConfigRoot = getDiConfigRootFromJson(jsonFilePath);
			
			System.out.println("Values from JSON ....");
			System.out.println("sourceName: " + diConfigRoot.getSourceMetadata().getSourceName());
			System.out.println("file suffix: "+diConfigRoot.getSourceMetadata().getFilesToCopy().get(0).getFileNameSufix());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("Done !!");
	}

}
