import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ObjectMapperTest {
    public static void main(final String... args) throws IOException {
        HttpExchange exchange = null;

        ObjectMapper obm = new ObjectMapper();
        Scanner sc = new Scanner(System.in);
        Player player = new Player(sc.nextInt(), sc.next());
        String responseBody = "";
        try {
            responseBody = obm.writeValueAsString(player);



        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(responseBody);
        player = player;
        System.out.println(player);
    }
}