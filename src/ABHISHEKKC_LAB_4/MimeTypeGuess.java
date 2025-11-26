package ABHISHEKKC_LAB_4;

import java.net.*;
import java.io.*;
import java.nio.file.*;

public class MimeTypeGuess {

    public static void main(String[] args) {

        try {
            URL urlPage = new URL("https://kathford.edu.np");
            URLConnection con1 = urlPage.openConnection();
            System.out.println("MIME of Webpage : " + con1.getContentType());

            URL urlPng = new URL("https://khemrajbahadurraut.com.np/main-logo/logo.png");
            URLConnection con2 = urlPng.openConnection();
            System.out.println("MIME of PNG     : " + con2.getContentType());

            URL UrlCss = new URL("https://kathford.edu.np/wp-content/themes/kathford/style.css");
            URLConnection con3 = UrlCss.openConnection();
            System.out.println("MIME of CSS     : " + con3.getContentType());

            URL urlIco = new URL("https://khemrajbahadurraut.com.np/carousel/carougit sel1.jpg");
            URLConnection con4 = urlIco.openConnection();
            System.out.println("MIME of JPEG : " + con4.getContentType());


            File localPdf = new File("FontPageNetwork.pdf");
            String pdfMime = Files.probeContentType(localPdf.toPath());
            System.out.println("MIME of Local PDF : " + pdfMime);

        }
        catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
