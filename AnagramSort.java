package pkg;

import java.util.Arrays;

public class AnagramSort {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		System.out.println(Arrays.equals(a, b));
		String [] input={"god","dog", "abc", "cab", "man"};
		Arrays.sort(input);
		
	}

	/*
	 * private static void anagramSorted(String[] input) { Map<> }
	 */

	private static boolean isAnagram(String first, String second) {
		boolean result = false;
		if (first != null && second != null && first.length() == second.length()) {
			int[] charset = new int[26];
			for (int i = 0; i < first.length(); i++)
				charset[(int) (first.charAt(i) - 'a')] += 1;
			for (int i = 0; i < second.length(); i++)
				charset[(int) (second.charAt(i) - 'a')] -= 1;
			for (int val : charset)
				if (val != 0)
					return false;
			result =true;
		}
		return result;
	}

	private static int binaryToInteger(String binary) {
		char[] numbers = binary.toCharArray();
		int result = 0;
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] == '1')
				result += 1 << (numbers.length - 1 - i);
		return result;
	}
}
