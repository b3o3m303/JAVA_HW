import java.util.Scanner;

public class HW_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A值:");
		int a = scn.nextInt();
		System.out.println("請輸入B值:");
		int b = scn.nextInt();
		System.out.println("請輸入「＋」、「－」、「＊」 ");
		String c = scn.next();
		if (c.equals("+")) {
			int z = a + b;
			System.out.println(a + "+" + b + "=" + z);
		}
		if (c.equals("-")) {
			int r = a - b;
			System.out.println(a + "-" + b + "=" + r);
		}
		if (c.equals("*")) {
			int e = a * b;
			System.out.println(a + "*" + b + "=" + e);
		}
		
		if (c.equals("/")) {
		
			System.out.println("只算合、差、乘積");
		}
		}

	}
