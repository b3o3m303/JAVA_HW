import java.util.Scanner;
public class T1005_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//判斷閏年 
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入測試年:");
		int t = scn.nextInt();
		switch(t%4){
		case 0:
			if(t%100==0&&t%400!=0){
				System.out.println(t+"不是閏年");
				int d=t+4;
				System.out.println("離"+t+"最近的閏年是"+d);
			}else
			System.out.println("今年為閏年");
			break;
		case 1:
			System.out.println(t+"不是閏年");
			int c=t+3;
			System.out.println("離"+t+"最近的閏年是"+c);
			break;
			
			
		case 2:
			System.out.println(t+"不是閏年");
			int d=t+2;
			System.out.println("離"+t+"最近的閏年是"+d);
			break;
			
			
		case 3:
			System.out.println(t+"不是閏年");
			int a=t+1;
			System.out.println("離"+t+"最近的閏年是"+a);
			break;
			default:System.out.println("Error");
		}
		
		
		
	}

}
