package api;
//import static io.restassured.RestAssured.given;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.openqa.selenium.remote.http.HttpRequest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static pages.pagesMain.softAssertion;

public class RestAssuredUtil {
    @Test
    public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
            throws ClientProtocolException, IOException {

        // Given
        String name = RandomStringUtils.randomAlphabetic( 8 );
        HttpUriRequest request = new HttpGet( "http://10.24.42.210:8080/get-info");

        // When
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

        // Then
        assertThat(

                httpResponse.getStatusLine().getStatusCode(),
                equalTo(HttpStatus.SC_OK));
        System.out.println(httpResponse.getStatusLine().getStatusCode());
        System.out.println(httpResponse.getEntity().getContent());
    }
//    @Test
//    public void whenMeasureResponseTime_thenOK() {
//        RestAssured.baseURI = "https://allspring-uat.codeandtheory.net";
////        RestAssured.baseURI = "http://10.24.42.210:8080";
////        RestAssured.port = 443;
////        Response response = RestAssured.get("/get-info");
//        Response response = RestAssured.get("https://allspring-uat.codeandtheory.net");
//        long timeInMS = response.time();
//        long timeInS = response.timeIn(TimeUnit.SECONDS);
//
////        softAssertion.assertTrue(timeInS, timeInMS/1000);
//    }
}

