package api;
//import static io.restassured.RestAssured.given;


import io.restassured.RestAssured;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.AnonymousAWSCredentials;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
//import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
//import com.amazonaws.services.cognitoidp.model.*;
//import com.amazonaws.util.Base64;
//import com.amazonaws.util.StringUtils;

import java.io.*;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RestAssuredUtil2 {

//    @BeforeClass
//    public static void exampleOfLogin() {
//        String body = String.format("//json");
//        Cookies cookies = RestAssured.given()
//                .contentType(ContentType.JSON)
//                .when()
//                .body(body)
//                .post("http://44.200.254.80:8080/")
//                .then()
//                .statusCode(200)
//                .extract()
//                .response()
//                .getDetailedCookies();
//
//    }

    @Test
    public void whenMeasureResponseTime_thenOK() throws IOException {
        // Given
        HttpUriRequest request = new HttpGet("http://44.200.254.80:8080/");
        String token = "eyJraWQiOiJ5MWdQTGcrU1JrUHpUM2J2aHZQR3JBOUhlNmdINUVPU0l6bnRPVXcxY2JrPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIwYzI2YjNmZS03ODQyLTRkMWQtODRiNi0wYzgzNDZhZmUxODciLCJkZXZpY2Vfa2V5IjoidXMtZWFzdC0xX2JlODA2YjcwLTNhODctNGU1NC04MjM2LTcyODQzMzg0MTc3NSIsImNvZ25pdG86Z3JvdXBzIjpbInVicy1wYXJ0bmVycyJdLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV93VGp6V1BPNEkiLCJjbGllbnRfaWQiOiI0ZnNhYmtmNDYzcGdxNGdnaG5uNGd0dmw3Iiwib3JpZ2luX2p0aSI6IjA3YjUyZmEzLTk4ZTMtNDkxOS05ZmZjLWRlMGM4NmJlYjYxYSIsImV2ZW50X2lkIjoiM2JmMThhZTItMDY2Yy00ODRhLWE0MTUtNTIyZTM0NjM5NGVhIiwidG9rZW5fdXNlIjoiYWNjZXNzIiwic2NvcGUiOiJhd3MuY29nbml0by5zaWduaW4udXNlci5hZG1pbiIsImF1dGhfdGltZSI6MTY3MjI1MjM4NywiZXhwIjoxNjcyMzM4Nzg3LCJpYXQiOjE2NzIyNTIzODcsImp0aSI6IjgzMWYzZDk0LWIyYjUtNDcwYi05MThmLWVhMDQ2YjI2OWUxOSIsInVzZXJuYW1lIjoiMGMyNmIzZmUtNzg0Mi00ZDFkLTg0YjYtMGM4MzQ2YWZlMTg3In0.VqCMJHHmGugVuIzgC8TJbayfZ4bnQStIb2iLdyk2BQK1IfVSyIbxbpPSyCrrpHVisIWhOf17_YpetWZLCSmcmC-PmUD8K3CccMZf9iyUoXiYe9oMKgkNp08IO3EJdYH-Xe4rcn-2XXY8RUtBjtlJZ-2XSBK8rmUw9Cki34AWzyBaszAQI9rpwaJfEqDRCUGLB4kDI8ZuIgK62lp6JYHUBnuSxcsC3jZ95hqSGZxhl9BSLw1eILVDjSNSwJJJcXMUQWvezqVPIOehNi21dlds_IxSNeLcZef0DQZWzegJZ7qikhZSeES60IPw_Azk_U2ZV05iuieB1XsDaDhZrzG3PA";

        request.addHeader("Authorization", "Bearer " + token);
        Header[] headers = request.getAllHeaders();
        // When
        HttpResponse response = HttpClientBuilder.create().build().execute(request);
        ;
        System.out.println(response.getHeaders("Cookie"));
        System.out.println(response.getStatusLine().getStatusCode());
//        System.out.println(response.getAllHeaders());
        // Then
        assertThat(
                response.getStatusLine().getStatusCode(),
                equalTo(HttpStatus.SC_OK));

    }


//    String PerformSRPAuthentication(String username, String password) {
//        String authresult = null;
//
//        InitiateAuthRequest initiateAuthRequest = initiateUserSrpAuthRequest(username);
//        try {
//            AnonymousAWSCredentials awsCreds = new AnonymousAWSCredentials();
//            AWSCognitoIdentityProvider cognitoIdentityProvider = AWSCognitoIdentityProviderClientBuilder
//                    .standard()
//                    .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
//                    .withRegion(Regions.fromName(this.region))
//                    .build();
//            InitiateAuthResult initiateAuthResult = cognitoIdentityProvider.initiateAuth(initiateAuthRequest);
//            if (ChallengeNameType.PASSWORD_VERIFIER.toString().equals(initiateAuthResult.getChallengeName())) {
//                RespondToAuthChallengeRequest challengeRequest = userSrpAuthRequest(initiateAuthResult, password);
//                RespondToAuthChallengeResult result = cognitoIdentityProvider.respondToAuthChallenge(challengeRequest);
//                //System.out.println(result);
//                System.out.println(CognitoJWTParser.getPayload(result.getAuthenticationResult().getIdToken()));
//                authresult = result.getAuthenticationResult().getIdToken();
//            }
//        } catch (final Exception ex) {
//            System.out.println("Exception" + ex);
//
//        }
//        return authresult;
//    }
//
//
//    private InitiateAuthRequest initiateUserSrpAuthRequest(String username) {
//
//        InitiateAuthRequest initiateAuthRequest = new InitiateAuthRequest();
//        initiateAuthRequest.setAuthFlow(AuthFlowType.USER_SRP_AUTH);
//        initiateAuthRequest.setClientId(this.clientId);
//        //Only to be used if the pool contains the secret key.
//        //initiateAuthRequest.addAuthParametersEntry("SECRET_HASH", this.calculateSecretHash(this.clientId,this.secretKey,username));
//        initiateAuthRequest.addAuthParametersEntry("USERNAME", username);
//        initiateAuthRequest.addAuthParametersEntry("SRP_A", this.getA().toString(16));
//        return initiateAuthRequest;
//    }
}
//
//
//
//
//    }

//    @Component
//    public class FeignClientInterceptor implements RequestInterceptor, api.FeignClientInterceptor {
//
//        private static final String AUTHORIZATION_HEADER = "Authorization";
//
//        public static String getBearerTokenHeader() {
//            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getHeader("Authorization");
//        }
//
//        @Override
//        public void apply(RequestTemplate requestTemplate) {
//
//            requestTemplate.header(AUTHORIZATION_HEADER, getBearerTokenHeader());
//
//        }
//    }
//    public void SetAuthorizationHeader(String username, String password, HttpClient request)
//    {
//        String usernamePassword = String.format("{0}:{1}", username, password);
//        String base64usernamePassword = convert.ToBase64String(EncodingUtils.getAsciiBytes(usernamePassword));
//        request.DefaultRequestHeaders.Add("Authorization", "Basic " + base64usernamePassword);
//    }


