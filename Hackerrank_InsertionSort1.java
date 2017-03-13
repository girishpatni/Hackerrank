package pkg;

import java.util.Scanner;

public class Hackerrank_InsertionSort1 {

	public static void insertIntoSorted(int[] arr) {
		if (arr.length > 1) {
			int temp = arr[arr.length - 1];
			int i = arr.length - 1;
			for (; i > 0; i--) {
				if (temp < arr[i - 1])
					arr[i] = arr[i - 1];
				else
					break;
				printArray(arr);
			}
			arr[i] = temp;
			printArray(arr);
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
