package pkg;

public class FindNumZeros {

	public static void main(String[] args) {
		int[] array = { 0, 1, 1, 1, 1, 1 };
		System.out.println(findNumZeros(array, 0, array.length - 1));
		System.out.println(findNumZerosRecursive(array, 0));
		System.out.println(findNumZerosRecursive2(array, 0, array.length - 1));
	}

	private static int findNumZeros(int[] input, int start, int end) {
		int count = 0;
		int mid = 0;
		while (start <= end) {
			mid = end - start / 2;
			if (input[mid] == 0) {
				count += mid + 1;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return count;
	}

	private static int findNumZerosRecursive(int[] input, int startIndex) {
		int count = 0;
		if (startIndex < input.length - 1 && input[startIndex] == 0) {
			count = 1 + findNumZerosRecursive(input, startIndex + 1);
		}
		return count;
	}

	private static int findNumZerosRecursive2(int[] input, int start, int end) {
		int count = 0;
		int mid = end - start / 2;
		if (start <= end) {
			if (input[mid] == 0)
				count = mid + 1 + findNumZerosRecursive2(input, mid + 1, end);
			else
				count = findNumZerosRecursive2(input, start, mid - 1);
		}
		return count;
	}
}
