import com.sun.net.httpserver.Headers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HTTPHeaderViewer {
    private static Map<String, String> headers = new HashMap<>();
    private static HttpURLConnection hc;

    public static Map<String, String> getHeaders(String urlString){
        try{
            URL url = new URL(urlString);
            hc = (HttpURLConnection) url.openConnection() ;
            hc.setRequestMethod("HEAD");
            hc.setConnectTimeout(5000);
            hc.setReadTimeout(5000);

            for(Map.Entry<String, List<String>> header: hc.getHeaderFields().entrySet()){
                for(String value:header.getValue()){
                    headers.put(header.getKey(),value);
                }
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return headers;

    }

}
