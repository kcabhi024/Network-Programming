package ABHISHEK_KC_LAB1;

import java.net.*;

public class AllAddresses {

    public static void main(String[] args) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("dns.google.com");
            System.out.println("All IP Addresses of dns.google.com:");
            System.out.println("\nIPv4 Addresses ");
            for (InetAddress ip : addresses) {
                byte[] bytes = ip.getAddress();
                if (bytes.length == 4) {   // IPv4 has 4 bytes
                    System.out.println(ip.getHostAddress());
                }
            }
            System.out.println("\nIPv6 Addresses");
            for (InetAddress ip : addresses) {
                byte[] bytes = ip.getAddress();
                if (bytes.length == 16) {  // IPv6 has 16 bytes
                    System.out.println(ip.getHostAddress());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
