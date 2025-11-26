package ABHISHEK_KC_LAB1;

import java.net.*;
import java.util.*;

public class ListNetworkAdapters {

    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();

            while (nets.hasMoreElements()) {
                NetworkInterface net = nets.nextElement();
                System.out.println("Name: " + net.getName());
                System.out.println("Display Name: " + net.getDisplayName());
                System.out.println("-------------------------------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
