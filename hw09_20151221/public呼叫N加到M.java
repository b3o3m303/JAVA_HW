import java.util.Scanner;

public class public©I•sN•[®ÏM {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        c(n);
    }

    public static void c(int n) {
        int sum = 0;
        int i = 1;
        while (sum + i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(i);
    }
}
