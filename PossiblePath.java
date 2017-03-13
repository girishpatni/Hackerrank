package pkg;

import java.util.Scanner;

public class PossiblePath {
	
	public static boolean isPossiblePath(int a, int b, int x, int y) {
		int gcdAB = gcd(a, b);
		int gcdXY = gcd(x, y);
		return (gcdAB == gcdXY);
	}

	private static int gcd(int x, int y) {
		if (x == y) {
			return x;
		}
		int a = x;
		int b = y;
		if (a < b) {
			a = y;
			b = x;
		}
		int modulo = a % b;
		if (modulo == 0) {
			return b;
		}
		return gcd(b, modulo);
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		int x = console.nextInt();
		int y = console.nextInt();
		solveAndPrint(a, b, x, y);
		console.close();
	}

	private static void solveAndPrint(int a, int b, int x, int y) {
		if (isPossiblePath(a, b, x, y)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
