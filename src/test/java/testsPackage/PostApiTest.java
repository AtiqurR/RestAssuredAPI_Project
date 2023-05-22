package testsPackage;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.reqres.qa.PostApi;

public class PostApiTest {
	
	PostApi postApi;
	
	@Before
	public void initClass() {
		postApi=new PostApi();
	}

	@Test
	public void testingPostApi() throws IOException {
	 String response=postApi.postUserApi();
	 System.out.println(response);
	 
//	 int statusCode=postApi.postApiStatusCode();
//	 System.out.println("Status Code : "+ statusCode);
	}
	
}
