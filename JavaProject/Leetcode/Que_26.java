import java.util.Arrays;

public class Que_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9 };
		int n = nums.length;
		if (n == 0) {
			System.out.println(0);
		}
		int fast = 1, slow = 1;
		while (fast < n) {
			if (nums[fast] != nums[fast - 1]) {
				nums[slow] = nums[fast];
				++slow;
			}
			++fast;
		}
		
		//System.out.println(Arrays.toString(nums));
	}

}
