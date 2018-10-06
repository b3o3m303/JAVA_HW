import java.util.Scanner;

public class public遞迴三數公倍數 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        System.out.println(lcm4(x, y, z));
    }

    public static int lcm1(int x, int y) {
        if (x < y) {
            int v = x;
            x = y;
            y = v;
        }
        if (y == 0) {
            return x;

        } else {
            return lcm1(y, x % y);
        }

    }

    public static int lcm3(int y, int z) {
        if (y < z) {
            int v = y;
            y = z;
            z = v;
        }
        if (z == 0) {
            return y;
        } else {

            return lcm3(z, y % z);

        }
    }

    public static int lcm4(int x, int y, int z) {
        return (x * y * z) / (lcm1(x, y) * lcm3(y, z));
    }
}
