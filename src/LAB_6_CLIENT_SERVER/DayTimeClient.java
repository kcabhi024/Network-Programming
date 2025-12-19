package LAB_6_CLIENT_SERVER;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DayTimeClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            System.out.println(in.readLine());

            socket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

