package ABHISHEK_KC_LAB1;


import java.net.*;

public class CompareAddresses {
    public static void main(String[] args) {
        try {
            InetAddress a1 = InetAddress.getByName("tu.edu.np");
            InetAddress a2 = InetAddress.getByName("fohss.tu.edu.np");

            if (a1.equals(a2)) {
                System.out.println( a1 +" and "+ a2 +" refer to the SAME IP.");
            } else {
                System.out.println(a1 +" and "+ a2 +" refer to DIFFERENT IPs.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
