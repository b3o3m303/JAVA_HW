import java.util.Scanner;

public class while���h {//n���h

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J�����n:");
        int n = scn.nextInt();
        int sum = 1;
        while (n > 0) {
            sum = sum * n;
            n--;

        }System.out.println(sum);

    }

}
