package hw;

import java.util.Scanner;
public class A914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	scn = new Scanner(System.in);
		System.out.println("�аݧA�O?");
		String name = scn.next();
		System.out.println("��!"+name+"�z�n�A�w��A�Ө�Ȥj��u�t!!" );
		
		System.out.println("�A�a�b����?");
		String yourhouse = scn.next();
		System.out.println("��!"+"�Ӧ�"+yourhouse+"��"+name+"�z�n" );
		
		System.out.println("�A�����ӤW��?");
		String howgo = scn.next();
		System.out.println(howgo);
		
		System.out.println("��~~���"+name+"�A���O�C�ѱq"+yourhouse+howgo+"��Ȥj�W�Ǫ���!");
		}

}
