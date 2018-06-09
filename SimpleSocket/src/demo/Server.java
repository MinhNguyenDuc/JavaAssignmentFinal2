package demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {


    public static void main(String[] args) {
        int port = 6000;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Khoi dong thanh cong doi client ket noi...");
            Socket clientConnection = serverSocket.accept();
            System.out.println("Client " + clientConnection.getInetAddress().getHostAddress() + " da ket noi");

            BufferedReader br = new BufferedReader(new InputStreamReader(clientConnection.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientConnection.getOutputStream()));

            String line = br.readLine();
            System.out.println(line);




        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }

}
