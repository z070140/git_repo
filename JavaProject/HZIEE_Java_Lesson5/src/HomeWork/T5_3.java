package HomeWork;

public class T5_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Locker lock1, lock2, lock3;
        lock1 = new Locker("Lisi", 3, 301);
        lock2 = new Locker("Zhangsan", 3, 302);
        lock3 = new Locker("Zhangsan", 2, 201);
        System.out.println(lock1);
//        System.out.println(lock1.toString());
//        System.out.println(lock2.toString());
//        System.out.println(lock3.toString());
//
//        lock1.setIsVacant(true);
//        if (lock1.getIsVacant()) {
//            System.out.println(lock1.toString());
//        }
//        if (lock2.hasSameHirer(lock3)) {
//            System.out.printf("Following lockers are used by %s:\n",
//                    lock2.getHirer());
//            System.out.println(lock2);
//            System.out.println(lock3);
//        }
    }
}

class Locker {
    private int num, cabinetNum;
    private boolean isVacant;
    private String hirer;

    public Locker(String hire, int cabinet, int num) {
        this.hirer = hire;
        cabinetNum = cabinet;
        this.num = num;
        isVacant = false;

    }

    public boolean getIsVacant() {
        return isVacant;
    }

    public void setIsVacant(boolean b) {
        isVacant = b;
        if (isVacant)
            hirer = "";
    }

    public String getHirer() {
        return hirer;
    }

    public boolean hasSameHirer(Locker otherL) {

        if (this.hirer.equals(otherL.hirer)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String str = "Cabinet: " + cabinetNum + ", Num: " + num;
        if (isVacant)
            str += " is vacant";
        else
            str += " is used by " + hirer;
        return str;

    }
}