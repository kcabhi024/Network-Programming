package ABHISHEK_KC_LAB1;

import java.net.*;

public class FindAddress {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("fohss.tu.edu.np");
            System.out.println("IP Address: " + address.getHostAddress());

            InetAddress myDomain = InetAddress.getByName("abhishekkc08.com.np");
            System.out.println("Canonical Name: " + myDomain.getCanonicalHostName());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
