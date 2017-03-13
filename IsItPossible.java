package pkg;

public class IsItPossible {

	public static void main(String[] args) {

	}

	static void isItPossible(int a, int b, int x, int y) {
		int first = gcd(a, b);
		int second = gcd(x, y);
		if (first == second)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	static int gcd(int u, int v) {
		if (u == v)
			return u;
		if (u == 0)
			return v;
		if (v == 0)
			return u;
		if ((~u & 1) > 0) {
			if ((v & 1) > 0)
				return gcd(u >> 1, v);
			else
				return gcd(u >> 1, v >> 1) << 1;
		}
		if ((~v & 1) > 0)
			return gcd(u, v >> 1);
		if (u > v)
			return gcd((u - v) >> 1, v);
		return gcd((v - u) >> 1, u);
	}

}
