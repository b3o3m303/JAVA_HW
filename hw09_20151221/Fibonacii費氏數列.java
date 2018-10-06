import java.util.Scanner;

public class Fibonacii¶O¤ó¼Æ¦C {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(c(n));
    }

    public static int c(int n) {
        int data[] = new int[999];
        data[0] = 1;
        data[1] = 1;
        for (int i = 2; i <= n; i++) {
            data[i] = data[i - 1] + data[i - 2];
        }
        return data[n];
    }
}
