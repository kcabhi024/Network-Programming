package ABHISHEK_KC_LAB1;

import java.net.*;

public class CanonicalHostName {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("abhishekkc08.com.np");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("Canonical Name: " + ip.getCanonicalHostName());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
