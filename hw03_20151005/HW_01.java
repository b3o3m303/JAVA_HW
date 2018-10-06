import java.util.Scanner;

public class HW_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別:");
		String a = scn.next();
		System.out.println("請輸入身高:");
		float tall = scn.nextFloat();
		if (a.equals("男")) {
			System.out.println("你的標準體重為:" + (((tall - 170) * 0.6) + 62));
		}
		if (a.equals("女")) {
			System.out.println("妳的標準體重為:" + (((tall - 158) * 0.5) + 52));
		}

		

	}

}
