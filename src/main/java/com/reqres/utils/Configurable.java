package com.reqres.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurable {
	
	
	
    private String path="./configuration/config.properties";
	
	private String baseUri;
	private String postUserApi;
	private String jsonFilePath;
	
	static Configurable configure;
	
	private Configurable() {
		
	}
	
	public static Configurable getInstance()  {
		if(configure==null) {
			configure=new Configurable();
			try {
				configure.loadProperties();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return configure;
	}
	
	private void loadProperties() throws IOException {
		FileInputStream fileInputStream=new FileInputStream(path);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		
		baseUri=properties.getProperty("baseUri");
		postUserApi=properties.getProperty("postUserApi");
		jsonFilePath=properties.getProperty("jsonFilePath");
	}

	public String getBaseUri() {
		return baseUri;
	}

	public String getPostUserApi() {
		return postUserApi;
	}

	public String getJsonFilePath() {
		return jsonFilePath;
	}

}
