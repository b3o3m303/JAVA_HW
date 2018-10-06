import java.util.Scanner;

public class public¨ç¦¡¤Gn¤è {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(c(n));

    }

    public static int c(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (int) Math.pow(2, i);
        }
        return sum;
    }
}
