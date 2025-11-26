package ABHISHEK_KC_LAB1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ServerLogProcessor {

    public static void main(String[] args) {
        String filePath = "server.log";   // Make sure server.log is in project folder

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            System.out.println("IP Address\tResource Requested\tHTTP Response");
            System.out.println("------------------------------------------------------");

            while ((line = br.readLine()) != null) {

                // Example log format:
                // 192.168.1.10 - - "GET /index.html HTTP/1.1" 200

                String[] parts = line.split(" ");

                // Extract IP, resource, response code
                String ip = parts[0];
                String resource = parts[6];        // e.g., /index.html
                String response = parts[8];        // e.g., 200

                System.out.println(ip + "\t" + resource + "\t\t" + response);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
