package JavaChapersTest.Chaper15.file.files;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class WebScraper {
    public static void main(String[] args) throws MalformedURLException {
        // http://www.google.com/welcome.html?name=john&age=11
        //scheme ->https
        // domain name ->www.google.com
        //path->/welcome.html?name=john&age=11
        try {
            String location = "http://www.google.com";
            URL url = new URL(location);
            InputStream inputStream = url.openStream();

            byte[] bytes = inputStream.readAllBytes();

            for (byte data : bytes) {
//                System.out.print((char) data);
                System.out.print(Character.toString(data));
            }

        }catch (Exception e){
            System.err.println("error: " + e);
            e.printStackTrace();
//
        }

    }
}
