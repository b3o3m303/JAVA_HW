import java.util.Scanner;

public class HW_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ʧO:");
		String a = scn.next();
		System.out.println("�п�J����:");
		float tall = scn.nextFloat();
		if (a.equals("�k")) {
			System.out.println("�A���з��魫��:" + (((tall - 170) * 0.6) + 62));
		}
		if (a.equals("�k")) {
			System.out.println("�p���з��魫��:" + (((tall - 158) * 0.5) + 52));
		}

		

	}

}
