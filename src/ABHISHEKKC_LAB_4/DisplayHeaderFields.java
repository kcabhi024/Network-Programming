package ABHISHEKKC_LAB_4;

import java.net.*;
import java.io.*;

public class DisplayHeaderFields {

    public static void main(String[] args) {

        try {

            URL url = new URL("http://abhishekkc08.com.np");
            URLConnection con = url.openConnection();
            System.out.println("HTTP Header Fields for: " + url +"\n");

            for (int i = 0; ; i++) {
                String Value = con.getHeaderField(i);

                if (Value == null) {
                    break;
                }

                String headerKey = con.getHeaderFieldKey(i);
                if (headerKey != null) {
                    System.out.println(headerKey + " : " + Value);
                } else {
                    System.out.println("Status-Line : " + Value);
                }
            }
        }
        catch (MalformedURLException e) {
            System.out.println("Invalid URL! Error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Network or I/O Error: " + e.getMessage());
        }
    }
}
