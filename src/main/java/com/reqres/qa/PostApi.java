package com.reqres.qa;
import java.io.File;
import java.io.IOException;

import com.reqres.utils.Configurable;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostApi {
	
	
	public String postUserApi() throws IOException {
		return RestAssured
				.given()
				.baseUri(Configurable.getInstance().getBaseUri())
				.body(new File(Configurable.getInstance().getJsonFilePath())).contentType(ContentType.JSON)
				.when()
				.post(Configurable.getInstance().getPostUserApi())
				.asPrettyString();
	}
	
//	public int postApiStatusCode() throws IOException {
//		return RestAssured
//				.given()
//				.baseUri(Configurable.getInstance().getBaseUri())
//				.body(new File(Configurable.getInstance().getJsonFilePath())).contentType(ContentType.JSON)
//				.when()
//				.post(Configurable.getInstance().getPostUserApi())
//				.getStatusCode();
//	}

}
