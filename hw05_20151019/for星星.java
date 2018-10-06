import java.util.*;

public class for星星 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入數字");
        int a = scn.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int k = a+1; k > i + 1; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}