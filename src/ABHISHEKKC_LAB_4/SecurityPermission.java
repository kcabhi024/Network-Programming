package ABHISHEKKC_LAB_4;

import java.net.*;
import javax.net.ssl.*;
import java.security.cert.Certificate;
import java.io.*;


public class SecurityPermission {

    public static void main(String[] args) {
        try {
            String urlStr1 = "https://kathford.edu.np";
            String urlStr2 ="https://kathford.edu.np/contact-us/";
            URL url1 = new URL(urlStr1);
            URL url2 = new URL(urlStr2);
            System.out.println("Security Permission for:\n " + urlStr1 + ":" +
                    url1.openConnection().getPermission() + "\n");
            System.out.println("Security Permission for:\n " + urlStr2 + ":" +
                    url2.openConnection().getPermission() +"\n");

        }
        catch (MalformedURLException e){
            System.out.println("Error While passing URL");
        }

        catch (IOException e) {
            System.out.println("Security error: " + e.getMessage());
        }


    }
}
