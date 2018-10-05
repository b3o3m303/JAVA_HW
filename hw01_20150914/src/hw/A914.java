package hw;

import java.util.Scanner;
public class A914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	scn = new Scanner(System.in);
		System.out.println("請問你是?");
		String name = scn.next();
		System.out.println("嗨!"+name+"您好，歡迎你來到亞大資工系!!" );
		
		System.out.println("你家在哪裡?");
		String yourhouse = scn.next();
		System.out.println("嗨!"+"來自"+yourhouse+"的"+name+"您好" );
		
		System.out.println("你都怎麼來上學?");
		String howgo = scn.next();
		System.out.println(howgo);
		
		System.out.println("喔~~原來"+name+"你都是每天從"+yourhouse+howgo+"到亞大上學的啊!");
		}

}
