import java.util.Scanner;

public class T1005_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���Z:");
		int a = scn.nextInt();
		if (a<101 &&a > 97) {
			System.out.println("���Z���ĬOA+");
		}else if (97 >= a && a >= 94) {
				System.out.println("���Z���ĬOA");
			} else

			if (a < 94 && a >= 90) {
				System.out.println("���Z���ĬOA-");
			} else if (a < 90 && a >= 87) {
				System.out.println("���Z���ĬOB+");

			} else if (a < 87 && a >= 84) {
				System.out.println("���Z���ĬOB");
			} else if (a < 84 && a >= 80) {
				System.out.println("���Z���ĬOB-");
			} else if (a < 80 && a >= 77) {
				System.out.println("���Z���ĬOC+");
			} else if (a < 77 && a >= 74) {
				System.out.println("���Z���ĬOC");
			} else if (a < 74 && a >= 70) {
				System.out.println("���Z���ĬOC-");
			} else if (a < 70 && a >= 67) {
				System.out.println("���Z���ĬOD+");
			} else if (a < 67 && a >= 64) {
				System.out.println("���Z���ĬOD");
			} else if (a < 64 && a >= 60) {
				System.out.println("���Z���ĬOD-");
			} else if (a < 60) {
				System.out.println("���Z����E");
			} else {System.out.println("Error");
			}
		}

	}


