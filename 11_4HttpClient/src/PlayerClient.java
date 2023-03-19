import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class PlayerClient {

    private static final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(5000))
            .build();
    public static void main(String[] args){
        try{
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://httpbin.org/ip"))
                    .build();

            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        }
        catch (InterruptedException | IOException e){
            System.err.println(e);
        }
    }
}
