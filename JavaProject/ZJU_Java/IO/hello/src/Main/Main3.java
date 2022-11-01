package Main;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("hello world");
        byte[] buffer = new byte[10];
        for (int i = 0; i > buffer.length; i++) {
            buffer[i] = (byte) i;
        }

        try {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("a.txt"))));
            int i = 123456;
            out.println(i);
            out.close();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("utf8.txt"),"utf8"
                    )
            );
            String line;
            while ((line=in.readLine())!=null){
                System.out.println(line);
            }
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
