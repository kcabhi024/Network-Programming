package ABHISHEK_KC_LAB2;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DownloadWebPage {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            URL url = new URL("https://www.kathford.edu.np");
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println(" Downloaded Web Page Content \n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to download or read the web page.");
            System.out.println("Details: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing reader.");
            }
        }
    }
}

