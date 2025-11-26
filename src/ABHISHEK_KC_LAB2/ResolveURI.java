package ABHISHEK_KC_LAB2;

import java.net.URI;
import java.net.URISyntaxException;

public class ResolveURI {
    public static void main(String[] args) {
        try {
            URI base = new URI("https://kathford.edu.np/about-us/");
            URI relative = new URI("/kathford-scholarships");
            URI resolved = base.resolve(relative);
            System.out.println("--- URI Resolution ---");
            System.out.println("Base URI: " + base);
            System.out.println("Relative URI: " + relative);
            System.out.println("Resolved (Absolute) URI: " + resolved);
        } catch (URISyntaxException e) {
            System.out.println("Error: Invalid URI syntax.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}
