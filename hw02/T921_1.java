package hw;

import java.util.*;

public class T921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A值:");
		int a = scn.nextInt();
		System.out.println("請輸入B值:");
		int b = scn.nextInt();
		if (a != b) {
			if (a > b) {
				System.out.println(a + ">" + b);
			} else {
				System.out.println(a + "<" + b);
			}
		} else {
			System.out.println(a + "=" + b);
		}
	}
}
