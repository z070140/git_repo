package ArrayInedx;

import java.util.ArrayList;
import java.util.Scanner;

class OpenException extends Exception {
}

class CloseException extends OpenException {
}

class NewException extends Exception {
}

public class ArrayInedx {
    public ArrayInedx() throws OpenException {
    }

    public void f() throws OpenException {
    }

    public static void main(String[] args) {
    }
}

class NewClass extends ArrayInedx {
    public NewClass() throws OpenException, NewException {
    }
    //Override
    public void f() {
    }

    public static void main(String[] args) {

	try {
	    ArrayInedx p = new NewClass();
	    p.f();
	} catch (OpenException e) {
	    e.printStackTrace();
	} catch (NewException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
