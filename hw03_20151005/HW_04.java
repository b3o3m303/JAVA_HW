import java.util.Scanner;

public class HW_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�����:");
		int a =scn.nextInt();
		switch(a%2){
		case 0:
			System.out.println("���Ƭ�����");
		break;
		case 1:
			System.out.println("���Ƭ��_��");
		break;
		default:System.out.println("Error");
		}
	}

}
