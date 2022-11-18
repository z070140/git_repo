package access.connection2;

import access.connection2.ConnectionManager;

public class Connection {
    private static int counter = 0;
    private int id = counter++;

    Connection() {
    }

    @Override
    public String toString() {
        return "Connection " + id;
    }

    public void doSomething() {

    }

    public void checkIn() {
        ConnectionManager.checkIn(this);
    }
}
