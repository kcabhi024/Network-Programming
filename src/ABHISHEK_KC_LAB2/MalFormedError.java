package ABHISHEK_KC_LAB2;

import java.net.URL;
import java.net.MalformedURLException;

public class MalFormedError {
    public static void main(String[] args) {

        try {
        String urlString = "https://www.google.com/search?q=image&tbm=isch&ved=2ahUKEwj827nasvb3AhV-";
            URL url = new URL(urlString);

            System.out.println("Full URL: " + url);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("HostName: " + url.getHost());
            System.out.println("Port: " + (url.getPort() == -1 ? "Default (none specified)" : url.getPort()));
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment Id:  " + url.getRef() );
            System.out.println("UserInfo:  " + url.getUserInfo() );
            System.out.println("File Name :  " + url.getFile() );

        } catch (MalformedURLException e) {

            System.out.println("Error: The URL is malformed or invalid.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}

