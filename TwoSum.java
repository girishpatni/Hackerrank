package pkg;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] input = { 6, 5, 7, 3 };
		int[] res = new int[2];
		res = addsUp2(input, 12);
		for (int val : res)
			System.out.println(val);
	}

	public static boolean addsUp(int[] array, int target) {
		Arrays.sort(array);
		int right = array.length - 1;
		int left = 0;
		while (left < right) {
			if (array[right] + array[left] == target) {
				return true;
			} else if (array[right] + array[left] > target)
				right--;
			else
				left++;
		}
		return false;
	}

	public static int[] addsUp2(int[] array, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();// value required,index
														// pair
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int index = map.get(array[i]);
				result[0] = index;
				result[1] = i;
				return result;
			} else
				map.put(target - array[i], i);
		}
		return null;
	}
}
