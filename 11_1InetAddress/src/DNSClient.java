import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Optional;

public class DNSClient {
    public static Optional query(String urlString){
        InetAddress address = null;
        String ip = null;
        try{
            address = InetAddress.getByName(urlString);
            ip = address.getHostAddress();

        }catch (UnknownHostException e){
            System.out.println(urlString+"\t:Name or service not known.");
        }
        return Optional.ofNullable(ip);
    }
}
