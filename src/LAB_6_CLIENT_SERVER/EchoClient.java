package LAB_6_CLIENT_SERVER;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EchoClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6000);

            BufferedReader user = new BufferedReader(
                    new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            System.out.print("Enter message: ");
            out.println(user.readLine());

            System.out.println(in.readLine());

            socket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
