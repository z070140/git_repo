package WebIO;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class WebIO {
    public static  void main(String[] args){
        try{
            Socket socket = new Socket(InetAddress.getByName("localhost"),12345);
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())));
            out.println("Hello");
            out.flush();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()
                    )
            );
            String line;
            line = in.readLine();
            System.out.println(line);
            out.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
