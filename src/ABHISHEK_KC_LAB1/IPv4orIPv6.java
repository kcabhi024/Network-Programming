package ABHISHEK_KC_LAB1;

import java.net.*;

public class IPv4orIPv6 {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("abhishekkc08.com.np");
            byte[] bytes = address.getAddress();

            if (bytes.length == 4) {
                System.out.println("Host address "+address.getHostAddress() + " is IPv4");
            } else if (bytes.length == 16) {
                System.out.println("Host address "+address.getHostAddress() + " is IPv6");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
