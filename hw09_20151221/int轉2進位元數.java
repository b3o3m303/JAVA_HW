import java.util.Scanner;

import javax.xml.crypto.Data;

public class int轉2進位元數 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(c(n));
    }

    public static int c(int n) {
        String x = "";
        while (n >= 2) {
            x = n % 2 + x;
            n = n / 2;
        }
        x=x+1;
        int ans = 0;
        char v[] = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (v[i] - '1' == 0) {
                ans = ans + 1;
            }
        }
        return ans;
    }
}
