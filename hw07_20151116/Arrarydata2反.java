import java.util.Scanner;

public class Arrarydata2¤Ï {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int[][] data = new int[3][3];
        int m = 1;
        int n = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % 2 == 0) {
                    data[i][j] = m;
                    m++;
                } else {
                    data[i][n] = m;
                    m++;
                    n--;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println(" ");
        }
    }
}
