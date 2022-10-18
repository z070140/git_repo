package HomeWork;

public class T5_8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date d1 = new Date();
        Date d2 = new Date(2021, 10, 1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(Math.abs(d1.interval(d2)));
    }

}

class Date {
    int year, month, day;

    Date() {
        year = 2000;
        month = 1;
        day = 1;
    }

    Date(int a, int b, int c) {
        year = a;
        month = b;
        day = c;
    }

    int interval(Date d2) {
        int days = 0;
        for (int i = year; i < d2.year; i++) {
            days += 365;
            if ((i % 4 == 0 && i % 100 != 0 || i % 400 == 0)) {
                days += 1;
            }


        }
        for (int i = 1; i < d2.month; i++) {
            switch (i) {
                case (1):
                    days = days + 31;
                    break;
                case (2):
                    days = days + 28;
                    break;
                case (3):
                    days = days + 31;
                    break;
                case (4):
                    days = days + 30;
                    break;
                case (5):
                    days = days + 31;
                    break;
                case (6):
                    days = days + 30;
                    break;
                case (7):
                    days = days + 31;
                    break;
                case (8):
                    days = days + 31;
                    break;
                case (9):
                    days = days + 30;
                    break;
                case (10):
                    days = days + 31;
                    break;
                case (11):
                    days = days + 30;
                    break;
                case (12):
                    days = days + 31;
                    break;


            }
        }
        days = days + d2.day-1;

        return days;
    }

}