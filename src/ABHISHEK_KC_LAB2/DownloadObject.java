package ABHISHEK_KC_LAB2;

import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadObject {
    public static void main(String[] args) {
        String fileURL = "https://kathford.edu.np/wp-content/uploads/2019/05/kath-log.svg";
        String saveFile = "kathford-logo.svg";  // Local file name

        try {
            System.out.println("Downloading object from: " + fileURL);
            URL url = new URL(fileURL);
            InputStream inputStream = url.openStream();
            FileOutputStream outputStream = new FileOutputStream(saveFile);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("Download complete! File saved as: " + saveFile);
        } catch (IOException e) {
            System.out.println("Error: Unable to download the object.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}
