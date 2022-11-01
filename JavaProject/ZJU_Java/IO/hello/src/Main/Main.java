package Main;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world");
        byte[] buffer = new byte[1024];
        try {
	    int len = System.in.read(buffer);
	    String s = new String(buffer,0,len);
	    System.out.println("读到了"+len+"字节");
	    System.out.println(s);
	    System.out.println("s"+s.length());
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
