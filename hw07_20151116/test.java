import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int data[][] = new int[5][5];
        int t = 1;
        int k = 0, i = 0;
        for (k = 0; k < 5; k++) {
         
            if (k % 2 == 0) {
                for (i = 0; i <= k; i++) {
                    data[i][k - i] = t;
                    t++;
                }
            } else {
                for (i = 0; i <= k; i++) {
                    data[k - i][i] = t;
                    t++;
                }
            }
        }
        for (k = 0; k < 5; k++) {
            if (k % 2 == 0) {
                for (i = 0; i <= k; i++) {
                    System.out.print(data[i][k - i]);
                }
               
            } else {
                for (i = 0; i <= k; i++) {
                    System.out.print(data[k - i][i]);
                }
            }
        }
    }
}