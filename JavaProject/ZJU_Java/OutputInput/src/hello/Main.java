package hello;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("hello world");
	byte[] buf = new byte[10];

	for (int i = 0; i < buf.length; i++) {
	    buf[i] = (byte) i;
	}
	try {
	    PrintWriter out = new PrintWriter(new BufferedWriter(
		    new OutputStreamWriter(new FileOutputStream("a.txt"))));
	    int i = 123456;
	    out.println(i);
	    out.close();
	    BufferedReader in = new BufferedReader(new InputStreamReader(
		    new FileInputStream("src/hello/Main.java"), "utf8"));
	    String line;

	    while ((line = in.readLine()) != null) {
		System.out.println(line);
	    }

	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
