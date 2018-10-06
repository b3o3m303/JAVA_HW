import java.util.*;

public class T_1116_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤JCourage mounteth with occasion");
		String b = scn.nextLine();
		char c[] = new char[b.length()];

		for (int i = 0; i < b.length(); i++) {
			c[i] = b.charAt(i);
		}
		for (int i = 0; i < b.length(); i++) {
			for (int j = i + 1; j < b.length(); j++) {
				if(c[i]>=c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		for (int j = 0; j < b.length(); j++) {
			System.out.print(c[j]);
		}
	}

}
