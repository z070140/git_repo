
public class Que_35 {
    public static void main(String[] args) {
        int target = 5;
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int tar = 0;
        if (arr != null) {
         
          tar =   Find(arr, 0, arr.length - 1, target);
        }
        System.out.println(tar );
    }

    public static int Find(int[] arr, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
               return Find(arr, start, mid, target);
            } else {
               return Find(arr, mid + 1, end, target);
            }

        }

        return 0;
    }

}