package LAB_9_UDP_CLIENT_SERVER;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPTimeClient {

    public static void main(String[] args) {

        try {

            DatagramSocket socket = new DatagramSocket(0);
            System.out.println("The client is running at " + socket.getLocalPort());

            // prepare request
            InetAddress server = InetAddress.getByName("localhost");
            DatagramPacket request = new DatagramPacket(new byte[1], 1, server,2013);

            socket.send(request);

            DatagramPacket response = new DatagramPacket(new byte[1024], 1024);
            socket.receive(response);

            String content = new String(response.getData(), "US-ASCII");

            System.out.println("Recieved  from server " + content);

            socket.close();
        } catch(IOException e){
            e.printStackTrace();
        }

    }

    }
