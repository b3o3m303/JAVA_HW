import java.util.Scanner;

public class HW_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J��妨�Z:");
		float chinese = scn.nextFloat();
		System.out.println("�п�J�^�妨�Z:");
		float english = scn.nextFloat();

		System.out.println("�п�J�ƾǦ��Z:");
		float math = scn.nextFloat();
		double x = chinese + english + math;
		double y = (chinese + english + math) / 3;
		System.out.println("�A���`���Z��:" + x);
		System.out.println("�A���������Z��:" + y);
	}

}
