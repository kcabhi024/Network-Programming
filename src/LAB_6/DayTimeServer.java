package LAB_6;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class DayTimeServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("DayTime Server Started");

            Socket clientSocket = serverSocket.accept();

            PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true);

            out.println("Current Date and Time: " + LocalDateTime.now());

            clientSocket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

