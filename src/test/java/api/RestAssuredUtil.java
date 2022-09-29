package api;
//import static io.restassured.RestAssured.given;

import com.google.common.net.HttpHeaders;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.poi.ss.formula.functions.T;
import org.hamcrest.Matchers.*;
import org.openqa.selenium.remote.http.HttpMethod;
import org.testng.annotations.Test;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.testng.Assert.assertEquals;

public class RestAssuredUtil {
    @Test
    public void whenMeasureResponseTime_thenOK() {
        System.out.print(given().when().get(" ").getHeaders().toString());
//        HttpClient client = HttpClient.newHttpClient();
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(new URI("https://postman-echo.com/get"))
//                .build();
//
//        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
//
//        logger.info("Status {}", response.statusCode());
//
//    }
//    public HttpHeaders createHeaders(String username, String password){
//        return new HttpHeaders() {{
//            String auth = username + ":" + password;
//            byte[] encodedAuth = Base64.encodeBase64(
//                    auth.getBytes(Charset.forName("US-ASCII")) );
//            String authHeader = "Basic " + new String( encodedAuth );
//            set( "Authorization", authHeader );
//        }};
//    }
    }
}