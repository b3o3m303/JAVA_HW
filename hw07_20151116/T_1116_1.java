import java.util.*;

public class T_1116_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入1:遞增，2:遞減");
		int m = scn.nextInt();
		System.out.println("請輸入排序幾個數");
		int n = scn.nextInt();
		int a[] = new int[n];
		System.out.println("請輸入要排序的數");
		for(int i=0;i<5;i++) {
			a[i]=scn.nextInt();
		}
		
		
		if (m == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if(a[i]>=a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}else if(m==2) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if(a[i]<=a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}			
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
