import java.util.Scanner;

public class while4 {// �п�Jn ��X1*(1+1)+2*(2+1)+3*(3+1)...n*(n+1)

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("�п�J�����n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        while (n > 0) {
            for (int a = 1; a <= n; a++) {
                sum = sum + (a * (a + 1));
            }
            System.out.println(sum);
            break;
        }

    }

}
