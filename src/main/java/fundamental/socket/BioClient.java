package fundamental.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class BioClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6666);
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            socket.getOutputStream().write(input.nextLine().getBytes());
        }
    }
}
