import java.util.Scanner;

public class HW_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("�п�J����:" + "     (cm)");
		float tall = scn.nextFloat();

		System.out.println("�п�J�魫:" + "     (kg)");
		float m = scn.nextFloat();
		System.out.println("�A������:" + tall / 2.54 + "�T");
		System.out.println("�A���魫:" + m /0.454 + "�S");
	}

}
