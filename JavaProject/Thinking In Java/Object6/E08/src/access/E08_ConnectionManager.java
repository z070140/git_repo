package access;


import access.connection.Connection;
import access.connection.ConnectionManger;

public class E08_ConnectionManager {
    public static void main(String[] args) {
        Connection c = ConnectionManger.getConnection();
        while(c!=null){
            System.out.println(c);
            c.doSomething();
            c=ConnectionManger.getConnection();
        }
    }
}
