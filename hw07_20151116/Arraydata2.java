import java.util.Scanner;

public class Arraydata2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int m = 9;
        int a = 2;
        int[][] data = new int[3][3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (j % 2 == 0) {
                    data[i][j] = m;
                    m--;
                } else {
                    data[a][j] = m;
                    m--;
                    a--;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println("");
        }}

}
