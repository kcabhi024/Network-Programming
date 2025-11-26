package ABHISHEK_KC_LAB2;

import java.net.*;
import java.io.*;

public class GetMethodDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            String baseURL = "https://postman-echo.com/get";
            String query = "?name=Abhi+Kc&city=Kathmandu&course=BCA";
            URL url = new URL(baseURL + query);
            URLConnection connection = url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("--- Communicating with Server via GET Method ---\n");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to connect or read data from server.");
            System.out.println("Details: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing reader.");
            }
        }
    }
}
