package hw;

import java.util.*;

public class E921 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�JA��:");
		int a = scn.nextInt();
		System.out.println("�п�JB��:");
		int b = scn.nextInt();
		System.out.println("�п�J+�A-�A*�A/");
		String c = scn.next();
		if (c.equals("+")) {
			int z = a + b;
			System.out.println(a + "+" + b + "=" + z);
		}
		if (c.equals("-")) {
			int r = a - b;
			System.out.println(a + "-" + b + "=" + r);
		}
		if (c.equals("*")) {
			int e = a * b;
			System.out.println(a + "*" + b + "=" + e);
		}
		if (c.equals("/")) {
			int y = a / b;
			System.out.println(a + "/" + b + "=" + y);

		}

	}
}