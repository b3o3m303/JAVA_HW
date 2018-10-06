import java.util.*;

public class HW_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入人數");
		int loop=scn.nextInt();
		float sumH=0;
		float sumW=0;
		for(int i=1;i<=loop;i++) {
			System.out.println("請輸入第"+i+"位同學身高");
			sumH=sumH+scn.nextFloat();
			System.out.println("請輸入第"+i+"位同學體重");
			sumW=sumW+scn.nextFloat();
		}
		System.out.println("平均身高為:"+sumH/loop);
		System.out.println("平均體重為:"+sumW/loop);
	}

}
