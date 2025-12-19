package LAB_5_CLIENT_SIDE_SOCKET;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class SocketWrite {

    public static void main(String[] args) {

        try (Socket socket = new Socket("tu.edu.np", 80)) {

            // Set timeout
            socket.setSoTimeout(1000);

            // Open streams
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            // Write HTTP request
            Writer writer = new OutputStreamWriter(out, "UTF-8");
            writer.write("GET / HTTP/1.1\r\n");
            writer.write("Host: tu.edu.np\r\n");
            writer.write("Connection: close\r\n");
            writer.write("\r\n"); // end of request
            writer.flush();

            // Read server response
            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            StringBuilder builder = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                builder.append((char) c);
            }

            // Display response
            System.out.println("Server content:\n");
            System.out.println(builder.toString());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
