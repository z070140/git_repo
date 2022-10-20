package week3;

import java.util.HashMap;
import java.util.Scanner;

class citymap {
    private HashMap<String, Integer> cityid = new HashMap<String, Integer>();

    public void setCityid(String s, int n) {
        cityid.put(s, n);
    }

    public int getId(String s) {
        return cityid.get(s);
    }

    public void print() {
        for (String k : cityid.keySet()) {
            System.out.println(k + ":" + cityid.get(k));
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String();
        int cnt = 0;
        s = in.next();
        citymap c = new citymap();
        while (s.equals("###") != true) {
            c.setCityid(s, cnt++);
            s = in.next();
        }

        int[][] dis = new int[cnt][cnt];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                dis[i][j] = in.nextInt();
            }
        }

        String sstart = in.next();
        String send = in.next();

        System.out.println(dis[c.getId(sstart)][c.getId(send)]);
        in.close();

    }

}