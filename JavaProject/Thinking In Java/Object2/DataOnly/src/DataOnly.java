class DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i=1;
        data.d=1.1;
        data.b=true;
        System.out.println(data.i+":"+data.d+":"+data.b);
    }
}
