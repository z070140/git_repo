package access.cookie2;

public class Cookie {
    public Cookie(){
        System.out.println("Cookie constructor");
    }
    protected void bite(){
        System.out.println("bite");
    }
    protected  static  void greeting(){
        System.out.println("Hello client programmer!");
    }
}
