package allspring.api;
//import static io.restassured.RestAssured.given;


import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class RestAssuredUtil {
//    @Test
//    public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
//            throws ClientProtocolException, IOException {
//        URL url = new URL("http://44.200.254.80:8080/");
//        HttpURLConnection http = (HttpURLConnection)url.openConnection();
////        http.setRequestProperty("Accept", "application/json");
//        String token = "eyJraWQiOiJ5MWdQTGcrU1JrUHpUM2J2aHZQR3JBOUhlNmdINUVPU0l6bnRPVXcxY2JrPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIwYzI2YjNmZS03ODQyLTRkMWQtODRiNi0wYzgzNDZhZmUxODciLCJkZXZpY2Vfa2V5IjoidXMtZWFzdC0xX2JlODA2YjcwLTNhODctNGU1NC04MjM2LTcyODQzMzg0MTc3NSIsImNvZ25pdG86Z3JvdXBzIjpbInVicy1wYXJ0bmVycyJdLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV93VGp6V1BPNEkiLCJjbGllbnRfaWQiOiI0ZnNhYmtmNDYzcGdxNGdnaG5uNGd0dmw3Iiwib3JpZ2luX2p0aSI6IjkwODljNzNkLTE3NzktNGM5Mi05ZmYzLTk3ZTkzNDMwM2UxNiIsImV2ZW50X2lkIjoiMGZkOWJlODUtNzdlYS00N2NkLWJhMzQtOWQwYTJiMWZhN2ZkIiwidG9rZW5fdXNlIjoiYWNjZXNzIiwic2NvcGUiOiJhd3MuY29nbml0by5zaWduaW4udXNlci5hZG1pbiIsImF1dGhfdGltZSI6MTY3MTQ3NjMxOSwiZXhwIjoxNjcxNTYyNzE5LCJpYXQiOjE2NzE0NzYzMTksImp0aSI6IjFmYjU1MTdjLTY0MzAtNDJmMS04Yzk3LTE2YzVkYTIyOTFhYSIsInVzZXJuYW1lIjoiMGMyNmIzZmUtNzg0Mi00ZDFkLTg0YjYtMGM4MzQ2YWZlMTg3In0.H-aC0TB-zz4S2dH7eTjEtc-QwCEKfoLJLwVmbN5kZ8aCcFURFG3F4Oa4pUnfmMNxW7RyiAKTVkEpWDgBRdAADRONyixP0P63eEgW9epMNi0QSkGd_4m2MPsIOsRxvuuebIjmAN35bymJb3IUhS00F-_UM71DiU_CWqm5syj8_3ZEK6lCU16LXzPDQ93AXUg9-MhU-R463etkLh9tmgmJifFmW39J6ddN6XR9vfQ5vanXaw9lYmUNKAvE-81o59lnhjhOK55tB1pkuUe58jECMWIeQiJzYRch7TfC6HeRYi_Ru9_4WfaGM5m6kAY9IJQ6MFFIC6VKT8BnWLS2YiSQfg";
//        http.setRequestProperty("Authorization", "Bearer "+token);
////        http.setAuthenticator(token);
////        http.set
//
//        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
//        http.disconnect();
//    }
    @Test
    public void whenMeasureResponseTime_thenOK() throws IOException {
        URL url = new URL("http://44.200.254.80:8080/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        Map<String, String> parameters = new HashMap<>();
        String token = "eyJraWQiOiJ5MWdQTGcrU1JrUHpUM2J2aHZQR3JBOUhlNmdINUVPU0l6bnRPVXcxY2JrPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiIwYzI2YjNmZS03ODQyLTRkMWQtODRiNi0wYzgzNDZhZmUxODciLCJkZXZpY2Vfa2V5IjoidXMtZWFzdC0xX2JlODA2YjcwLTNhODctNGU1NC04MjM2LTcyODQzMzg0MTc3NSIsImNvZ25pdG86Z3JvdXBzIjpbInVicy1wYXJ0bmVycyJdLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV93VGp6V1BPNEkiLCJjbGllbnRfaWQiOiI0ZnNhYmtmNDYzcGdxNGdnaG5uNGd0dmw3Iiwib3JpZ2luX2p0aSI6ImU0MGRiMWRhLTkxMjAtNDVlZS04ZjQ2LWUxMTE3YTZjMmQ1MiIsImV2ZW50X2lkIjoiNzQyN2JlZTctOWY3OS00ODE4LTk2ZWYtOTEyY2RkNWI2MjM5IiwidG9rZW5fdXNlIjoiYWNjZXNzIiwic2NvcGUiOiJhd3MuY29nbml0by5zaWduaW4udXNlci5hZG1pbiIsImF1dGhfdGltZSI6MTY3MjE2NDk5MywiZXhwIjoxNjcyMjUxMzkzLCJpYXQiOjE2NzIxNjQ5OTMsImp0aSI6IjAyMTE4ZjU3LWNkOGQtNDMyMC05M2JhLTkyZGJjOTlkMmRhNyIsInVzZXJuYW1lIjoiMGMyNmIzZmUtNzg0Mi00ZDFkLTg0YjYtMGM4MzQ2YWZlMTg3In0.ElGzd6o08ehhfkkg2sYOBzeS0Y8XYZBSHGFBNYzIqExYQJtOX7ukReLwANUs7q_vZ4-rYS-pjgjrqCmlxqDtbETshrJCNTW051vQgYKqESoMn_IjhO2X1o-epa4uaGKmINP8DSSkG4bSg5xyv-cEU751RBo5JWZx1UlF4bh9_WHPWlk91SgdSNPS9dZg-vigu2dc2OIrCaqksJlRYXwQjWLuD5S91wGYwkikSsWJz7wYBXruAuwxSJo_ZfyJnqip0iUWwq54iN8W8G0ZyecqSlHBAlmQcJPqc6o57dDbfnBFIDOEdJkoaC0LzHZzyE9Tsc6eiGuwA3Z3wyLYUVLVqA";
//        parameters.put("Authorization", "Bearer "+ token);
        parameters.put("Authorization", token);
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
        out.flush();
        out.close();

        System.out.println(con.getInputStream());
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        System.out.println("Response is "+content);

    }
    public class ParameterStringBuilder {
        public static String getParamsString(Map<String, String> params)
                throws UnsupportedEncodingException {
            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, String> entry : params.entrySet()) {
                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                result.append("&");
            }

            String resultString = result.toString();
            return resultString.length() > 0
                    ? resultString.substring(0, resultString.length() - 1)
                    : resultString;
        }
    }
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


