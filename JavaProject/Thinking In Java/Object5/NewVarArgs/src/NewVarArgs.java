public class NewVarArgs {
//    static  void printArray(Object... args){
//        for(Object obj : args){
//            System.out.println(obj);
//        }
//    }

//    static  void printArray(Character... args){
//
//    }

    static  void printArray(int... args){
        System.out.println(args.getClass());
    }

//    public void printArray(Integer... args){
//
//    }
//
    static void printArray(char... args){
        System.out.println(args.getClass());
    }

    static void printArray(double... args){
        System.out.println(args.getClass());
    }
    static void printArray(float... args){
        System.out.println(args.getClass());
    }

    public static void main (String[] args){
        printArray(1);
        printArray('a');
        printArray(1.11);
        printArray(1.1f);
//        for (String str: args){
//            System.out.println(str);
//        }
        int a=1;
        System.out.println(a);
    }

}
