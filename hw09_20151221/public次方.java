import java.util.Scanner;

public class public¦¸¤è {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power1(a, n));
        System.out.println(power2(a, n));
    }

    public static int power1(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            return a * power1(a, n - 1);
        }
    }

    public static int power2(int a, int n) {
        if (n % 2 == 0) {
            if (n == 1) {
                return a;
            } else {
                return power2(a, n / 2) * power2(a, n / 2);
            }
        } else {
            if (n == 1) {
                return a;
            } else {
                return a * power2(a, n - 1);
            }
        }
    }
}
