import java.util.*;

public class for�P�P {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J�Ʀr");
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