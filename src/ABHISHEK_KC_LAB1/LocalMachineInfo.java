package ABHISHEK_KC_LAB1;
import java.net.*;
public class LocalMachineInfo {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Hostname: " + local.getHostName());
            System.out.println("Local Host Address: " + local.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
