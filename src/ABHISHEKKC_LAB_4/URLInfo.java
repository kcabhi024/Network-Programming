package ABHISHEKKC_LAB_4;

import java.net.*;
import java.io.*;

public class
URLInfo {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://kathford.edu.np");
            URLConnection con = url.openConnection();

            System.out.println("Content-Type     : " + con.getContentType());
            System.out.println("Content-Length   : " + con.getContentLength());
            System.out.println("Last-Modified    : " + con.getLastModified());
            System.out.println("Date (Accessed)  : " + con.getDate());

        } catch (MalformedURLException e) {
            System.out.println("Bad URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
