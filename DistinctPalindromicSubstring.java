package pkg;

import java.util.HashSet;
import java.util.Set;

public class DistinctPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(DistinctPalindromicSubstring.findDistinctPalidromic("geek"));
	}

	public static int findDistinctPalidromic(String s1) {
		Set<String> palidromicSet = new HashSet<String>();
		char charArray[] = s1.toCharArray();
		int i = 0;
		while (i < charArray.length) {
			DistinctPalindromicSubstring.fetchDistinct(i, palidromicSet, charArray, s1);
			i++;
		}
return palidromicSet.size();
	}

	public static void fetchDistinct(int level, Set<String> palidromicSet, char array[], String s1) {
		int j = level;
		while (j < array.length) {
			StringBuffer str = new StringBuffer(s1.substring(level, j + 1));
			str = str.reverse();
			if (s1.substring(level, j + 1).equals(str.toString())) {
				palidromicSet.add(s1.substring(level, j + 1));
			}
			j++;
		}
	}
}
