import java.util.*;

public class for星星2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入數字");
        int a = scn.nextInt();

        for (int i = 0; i <= a; i++) {
            for (int k = a+1; k > i +1; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = a-1; i >= 0; i--) {
            for (int k = a+2; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        
        
        
        
    }
}}