package pkg;

import java.util.*;

class Test {
	public int i = 0;

	@Override
	public int hashCode() {
		return i;
	}
}

public class Amazon1 {
	public static void main(String[] args) {
		HashMap<Test, String> hm = new HashMap<Test, String>();

		Test t1 = new Test();

		hm.put(t1, "success");

		System.out.println(hm.get(t1)); // print success

		t1.i = 10;

		System.out.println(hm.get(t1)); // NULL

	}
}