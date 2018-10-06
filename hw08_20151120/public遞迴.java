import java.util.Scanner;

public class public»¼°j {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        float n = scn.nextInt();
        System.out.println(c(n));
    }

    public static float c(float n) {
        float sum = 0;
        if (n <= 0) {
            return 0;
        }
        sum = (1 / ((2 * n - 1) * (2 * n))) + c(n - 1);

        return sum;
    }
}
