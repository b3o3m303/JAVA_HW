import java.util.*;

public class HW_05 {
	public static void main(String arg[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���ӼƦr");
		float []a=new float[5];
//		float max = scn.nextFloat();
//		float min = scn.nextFloat();
//		float c = scn.nextFloat();
//		float d = scn.nextFloat();
//		float e = scn.nextFloat();
		for(int i=0;i<5;i++) {
			a[i]=scn.nextFloat();
		}
		for(int j=0;j<5;j++) {
			for(int k=j+1;k<5;k++) {
				if(a[j]>=a[k]) {
					float temp=a[k];
					a[k]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("�̤p��:"+a[0]+"�̤j��:"+a[4]);
	}
}
