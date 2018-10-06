import java.util.Scanner;

public class HW_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		
		int sum=0;
		for(int i=13;i<=1399;i++)
		{ if(i%17==0)
			sum +=i;
		
		}System.out.println(sum);
		
		

	}

}
