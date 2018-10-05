package hw;

import java.util.*;

public class T9215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入傾角:");
		Double s = scn.nextDouble();
		System.out.println("請輸入兩輪軸心之軸距:");
		Double d = scn.nextDouble();
		System.out.println("請輸入輪胎尺寸:");
		Double f = scn.nextDouble();
		if (s > 43 && d > 130 && f == 12) {
			System.out.println("OK，合格，就是你了");
		} else

		{
			System.out.println("不合格");
		}

	}
}
