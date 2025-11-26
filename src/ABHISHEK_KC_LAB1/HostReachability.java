package ABHISHEK_KC_LAB1;

import java.net.*;

public class HostReachability {

    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("google.com");

            if (inet.isReachable(3000)) {
                System.out.println("Host is reachable.");
            } else {
                System.out.println("Host is NOT reachable.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
