package pkg;

import java.util.ArrayList;
import java.util.List;

public class Allfactors {

	public static void main(String[] args) {
		int idx = 0;
		String str = "-2147483649";
		 System.out.println(myAtoi(str));
		// System.out.println(str.substring(idx));
		// System.out.println(allFactors(18));
	}

	private static List<Integer> allFactors(int num) {
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				factors.add(i);
		}
		return factors;
	}

	public static int myAtoi(String str) {
		int idx = 0;
		while (idx < str.length() && str.charAt(idx) == ' ')
			idx++;
		char[] in = str.substring(idx).toCharArray();
		if (in.length == 0)
			return 0;
		char sign = (in[0] == '-') ? '-' : '+';
		long res = 0l;
		for (int i = 0; i < in.length; i++) {
			if (i == 0 && (in[i] == '-' || in[i] == '+'))
				continue;
			if (in[i] < '0' || in[i] > '9')
				break;
			res = res * 10 + in[i] - '0';
			if (sign == '+' && res > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign == '-' && res*-1 < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}
		if(sign == '-')
			res = res*-1;
		return (int)res;
	}
}
