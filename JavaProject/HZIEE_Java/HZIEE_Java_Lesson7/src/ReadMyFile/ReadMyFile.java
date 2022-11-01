package ReadMyFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadMyFile {
    public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	String nameString = inputScanner.next();
	String keyString = inputScanner.next();
	inputScanner.close();
	try {
	    BufferedReader in = new BufferedReader(
		    new InputStreamReader(new FileInputStream(nameString)));
	    String lineString;
	    while ((lineString = in.readLine()) != null) {
		if (lineString.indexOf(keyString)!=-1) {
		    System.out.println(lineString);
		}
	    }

	} catch (FileNotFoundException e) {
	    System.out.println("File Not Found");
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
