
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PngDownloader {
    public static Path get(String urlString){
        Image image = null;
        Path path = null;
        InputStream in = null;
        OutputStream out = null;
        try{
            URL url = new URL(urlString);
            File file =  new File("C:/Users/82105/Desktop/Java/11_2URL/image.png");

            in = url.openStream();
            out = new FileOutputStream(file);
            while(true){
                int data = in.read();
                if(data == -1){
                    break;
                }
                out.write(data);
            }

            in.close();
            out.close();
            path = Paths.get(String.valueOf(file));

            }

        catch(MalformedURLException e){
            System.err.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;

    }
}
