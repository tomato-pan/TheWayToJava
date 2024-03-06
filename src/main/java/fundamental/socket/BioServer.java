package fundamental.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class BioServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true) {
            // 阻塞直到有客户端连接
            Socket socket = serverSocket.accept();
            // 处理请求
            int len = -1;
            byte[] data = new byte[1024];//每次读取1k
            InputStream inputStream = socket.getInputStream();
            while ((len = inputStream.read(data)) != -1) {
                System.out.println(new String(data, 0, len));
            }
        }
    }
}