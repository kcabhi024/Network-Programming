package ABHISHEKKC_LAB_3;

import java.net.*;
import java.io.IOException;

public class EduCookieBlocker {

    public static void main(String[] args) {

        CookieManager manager = new CookieManager();

        CookiePolicy policy = new CookiePolicy() {
            @Override
            public boolean shouldAccept(URI uri, HttpCookie cookie) {
                String host = uri.getHost();
                // Block all .edu.np domains
                if (host.endsWith(".edu.np")) {
                    System.out.println("BLOCKED COOKIE from: " + host);
                    return false;
                }
                // Allow any other domain
                System.out.println("ALLOWED COOKIE from: " + host);
                return true;
            }
        };
        manager.setCookiePolicy(policy);
        CookieHandler.setDefault(manager);
        try {
            URL url1 = new URL("https://www.abhishekkc08.com.np");
            URL url2 = new URL("https://www.kathford.edu.np");

            url1.openConnection().getContent();
            url2.openConnection().getContent();

        } catch (IOException e) {
            System.out.println("Network Error: " + e.getMessage());
        }

    }
}
