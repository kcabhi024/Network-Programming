package ABHISHEK_KC_LAB2;

import java.net.URLEncoder;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class FormURLEncodingDemo {
    public static void main(String[] args) {
        try {
            String name = "Abhishek kc";
            String address = "Koteshowr, Jadibuti, Kathmandu";
            String email = "kcabhi112@gmail.com";
            String encodedName = URLEncoder.encode(name, "UTF-8");
            String encodedAddress = URLEncoder.encode(address, "UTF-8");
            String encodedEmail = URLEncoder.encode(email, "UTF-8");
            String formData = "name=  " + encodedName + "  &  address=  " + encodedAddress + "  &  email=  " + encodedEmail;
            System.out.println("--- Encoded x-www-form-urlencoded String ---");
            System.out.println(formData);
            String decodedData = URLDecoder.decode(formData, "UTF-8");
            System.out.println("\n--- Decoded Back to Original ---");
            System.out.println(decodedData);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: Encoding type not supported.");
        }
    }
}
