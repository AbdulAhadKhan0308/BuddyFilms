package server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class DatabaseServer {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ServerSocket serverSocket;
        Socket socket;
        System.out.println("Server started");
        try {
            serverSocket = new ServerSocket(5436);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        while (true) {
            try {
                socket = serverSocket.accept();
                Thread t = new Thread(new HandleClientSocket(socket));
                t.start();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
