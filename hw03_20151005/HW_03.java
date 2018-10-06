import java.util.Scanner;

public class HW_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入國文成績:");
		float chinese = scn.nextFloat();
		System.out.println("請輸入英文成績:");
		float english = scn.nextFloat();

		System.out.println("請輸入數學成績:");
		float math = scn.nextFloat();
		double x = chinese + english + math;
		double y = (chinese + english + math) / 3;
		System.out.println("你的總成績為:" + x);
		System.out.println("你的平均成績為:" + y);
	}

}
