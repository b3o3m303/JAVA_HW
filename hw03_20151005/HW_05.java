import java.util.Scanner;

public class HW_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("請輸入身高:" + "     (cm)");
		float tall = scn.nextFloat();

		System.out.println("請輸入體重:" + "     (kg)");
		float m = scn.nextFloat();
		System.out.println("你的身高:" + tall / 2.54 + "吋");
		System.out.println("你的體重:" + m /0.454 + "磅");
	}

}
