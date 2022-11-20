//: EnumDemo/EnumDemo.java\

enum TypeOfMoney {
    一元, 五元, 十元, 二十元, 五十元, 一百元
}

public class EnumDemo {
    //    TypeOfMoney s;
    public static void main(String[] args) {
        for (TypeOfMoney s : TypeOfMoney.values()) {
            System.out.println(s + ":" + s.ordinal());
            switch (s) {
                case 一元:
                    System.out.println("一元");
                    break;
                case 五元:
                    System.out.println("五元");
                    break;
                case 十元:
                    System.out.println("十元");
                    break;
                case 一百元:
                    System.out.println("一百元");
                    break;
            }
        }
    }
} /* Output
一元:0
        一元
        五元:1
        五元
        十元:2
        十元
        二十元:3
        五十元:4
        一百元:5
        一百元
*///:~