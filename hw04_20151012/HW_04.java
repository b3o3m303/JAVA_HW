import java.util.*;

public class HW_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�H��");
		int loop=scn.nextInt();
		float sumH=0;
		float sumW=0;
		for(int i=1;i<=loop;i++) {
			System.out.println("�п�J��"+i+"��P�Ǩ���");
			sumH=sumH+scn.nextFloat();
			System.out.println("�п�J��"+i+"��P���魫");
			sumW=sumW+scn.nextFloat();
		}
		System.out.println("����������:"+sumH/loop);
		System.out.println("�����魫��:"+sumW/loop);
	}

}
