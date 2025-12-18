package LAB_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class SocketRead {
    public static void main(String[] args) {
        String host = "time.nist.gov";
        int port = 13;
        try {
            Socket socket = new Socket(host, port);
            socket.setSoTimeout(10000);
            InputStream inputStream  = socket.getInputStream();
            System.out.println("Server Address : " + socket.getInetAddress());
            System.out.println("Server Port : " + socket.getPort());
            System.out.println("Local Address : " + socket.getLocalAddress());
            System.out.println("Local Port : " + socket.getLocalPort());

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "ASCII");
            StringBuilder stringBuilder = new StringBuilder();
            for (int c; (c = inputStreamReader.read()) != -1; ) {
                stringBuilder.append((char) c);
            }
            System.out.println("server content: " + stringBuilder);
            socket.close();
        }catch(IOException  e){
            System.out.println(e.getMessage());
        }

    }
}

