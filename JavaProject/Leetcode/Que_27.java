public class Que_27 {

    //双指针用法！！！
    public static void main(String[] args) {
        int val = 3;
        int[] nums = { 3, 2, 2, 2 };
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i = 0; i < slow; i++) {
            System.out.println(nums[i]);
        }

    }


}


//优化：如果遇到和val相同的值，将最后一位数据放入当前位置。右指针左移一位，如果赋值过来的数据依旧是和val相等
//则，继续将右指针指向的数据赋值到当前位置。
