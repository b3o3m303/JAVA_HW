import java.util.Scanner;
public class T1005_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�P�_�|�~ 
		Scanner scn =new Scanner(System.in);
		System.out.println("�п�J���զ~:");
		int t = scn.nextInt();
		switch(t%4){
		case 0:
			if(t%100==0&&t%400!=0){
				System.out.println(t+"���O�|�~");
				int d=t+4;
				System.out.println("��"+t+"�̪񪺶|�~�O"+d);
			}else
			System.out.println("���~���|�~");
			break;
		case 1:
			System.out.println(t+"���O�|�~");
			int c=t+3;
			System.out.println("��"+t+"�̪񪺶|�~�O"+c);
			break;
			
			
		case 2:
			System.out.println(t+"���O�|�~");
			int d=t+2;
			System.out.println("��"+t+"�̪񪺶|�~�O"+d);
			break;
			
			
		case 3:
			System.out.println(t+"���O�|�~");
			int a=t+1;
			System.out.println("��"+t+"�̪񪺶|�~�O"+a);
			break;
			default:System.out.println("Error");
		}
		
		
		
	}

}
