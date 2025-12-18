package LAB_6;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EchoServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Echo Server Started");

            Socket clientSocket = serverSocket.accept();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true);

            String msg;
            while ((msg = in.readLine()) != null) {
                out.println("Echo: " + msg);
            }

            clientSocket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

