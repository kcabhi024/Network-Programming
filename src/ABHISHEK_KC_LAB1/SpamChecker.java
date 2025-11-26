package ABHISHEK_KC_LAB1;
import java.util.Scanner;

public class SpamChecker {
    private static final String[] BLACKLIST = {
            "156.232.",
            "192.168.100.",
            "10.0.0."
    };
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IP address to check:");
        String ip = sc.nextLine();
        boolean spam = false;
        for (String bl : BLACKLIST) {
            if (ip.startsWith(bl)) {
                spam = true;
                break;
            }
        }
        if (spam) {
            System.out.println("This IP is marked as SPAM or SUSPICIOUS.");
        } else {
            System.out.println("This IP looks SAFE.");
        }
        sc.close();
    }
}
