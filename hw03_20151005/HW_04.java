import java.util.Scanner;

public class HW_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("叫块タ俱计:");
		int a =scn.nextInt();
		switch(a%2){
		case 0:
			System.out.println("计案计");
		break;
		case 1:
			System.out.println("计计");
		break;
		default:System.out.println("Error");
		}
	}

}
