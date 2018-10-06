import java.util.Scanner;

public class public©I¥s¦r¦ê¼Æ¦r¬Û¥[ {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        c(n);
    }

    public static int c(String n) {
        int sum = 0;
        char v[] = n.toCharArray();
        for (int i = 0; i < n.length(); i++) {
            if (v[i] - '0' >= 0 && v[i] - '0' <= 9) {
                sum = sum + (v[i]-'0');
            }
        }
        System.out.println(sum);
        return sum;

    }
}
