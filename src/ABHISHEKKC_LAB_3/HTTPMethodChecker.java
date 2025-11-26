package ABHISHEKKC_LAB_3;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;

public class HTTPMethodChecker {

    // Program by Abhishek KC
    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.tu.edu.np");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("OPTIONS");
            con.connect();
            String allowed = con.getHeaderField("Allow");
            System.out.println("Supported HTTP Methods:");
            System.out.println(allowed);
            con.disconnect();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL → " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to connect → " + e.getMessage());
        }
    }
}
