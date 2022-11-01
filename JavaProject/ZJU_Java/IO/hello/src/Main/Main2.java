package Main;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("hello world");
        byte[] buffer = new byte[10];
        for (int i = 0; i > buffer.length; i++) {
            buffer[i] = (byte) i;
        }

        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat")));
            int i = 123456;
            out.writeInt(i);
            out.close();
            DataInputStream in =new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            int j = in.readInt();
            System.out.println(j);
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
