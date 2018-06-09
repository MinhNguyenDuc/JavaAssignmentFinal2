package demo;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 6000);
            System.out.println("Ket noi thanh cong den server");

            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            Scanner scanner = new Scanner(System.in);
            System.out.println("Viet thong diep");
            String line = scanner.nextLine();
            bw.write("Client : " + line);
            bw.newLine();
            bw.flush();

            bw.close();
            br.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
