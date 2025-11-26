package ABHISHEKKC_LAB_3;

import java.net.*;
import java.util.List;

public class CookieStoreDemo {
    // Program by AbhishekKC
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();
        CookieStore store = manager.getCookieStore();
        try {
            URI uri = new URI("https://www.abhishekkc08.com.np");
            // 1. Add Cookies
            HttpCookie c1 = new HttpCookie("username", "AbhishekKC");
            HttpCookie c2 = new HttpCookie("sessionID", "ABC123");
            store.add(uri, c1);
            store.add(uri, c2);

            System.out.println("Cookies Added.\n");
            // 2. Get cookies for a specific URI
            List<HttpCookie> cookiesForURI = store.get(uri);
            System.out.println("Cookies for " + uri + ":");
            for (HttpCookie c : cookiesForURI) {
                System.out.println(c);
            }
            // 3. Get all cookies
            System.out.println("\nAll Stored Cookies:");
            for (HttpCookie cookie : store.getCookies()) {
                System.out.println(cookie);
            }
            // 4. Get all URIs that have cookies
            System.out.println("\nURIs in CookieStore:");
            for (URI u : store.getURIs()) {
                System.out.println(u);
            }
            // 5. Remove a specific cookie
            System.out.println("\nRemoving a specific cookie...");
            store.remove(uri, c1);
            // 6. Remove all cookies
            System.out.println("Removing all cookies...");
            store.removeAll();
            System.out.println("CookieStore Cleared.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
