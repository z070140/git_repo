package CreatMyFile;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreatMyFile {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	String textString = in.nextLine();

	try {
	    PrintWriter out = new PrintWriter(
		    new BufferedWriter(new OutputStreamWriter(
			    new FileOutputStream("myfile.txt"))));
	    out.print(textString);

	    out.close();
	   
//	    BufferedReader input = new BufferedReader(
//		    new InputStreamReader(new FileInputStream("myfile.txt")));
//	    String line;
//	    while ((line = input.readLine()) != null) {
//		System.out.println(line);
//	    }
//	    input.close();
	} catch (FileNotFoundException e) {

	    e.printStackTrace();
	} 
//	catch (IOException e) {
//	    // TODO: handle exception
//	    e.printStackTrace();
//	}
    }

}
