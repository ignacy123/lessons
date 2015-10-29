package lesson16;

import java.util.ArrayList;

public class Sum {
	public boolean execute(int index, int[] nums, int sum) {
		if (index == nums.length) {
			if(sum == 0){
			return true;
			}
			return false;
		}
		return execute(index+1, nums, sum - nums[index]) ||
		execute(index+1, nums, sum);
	}
	public static void main(String[] args) {
		Sum sum = new Sum();
		int[] numbers = new int[4];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		ArrayList list = new ArrayList<>();
		System.out.println(sum.execute(0, numbers, 1000));
	}
}
