import java.util.Scanner;//����

public class public�I�s�T����P�_�����T���Τp���� {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        v(0, 0, 0);
    }

    public static void v(int a, int b, int c) {
        for (a = 1; a <= 200; a++) {
            for (b = 1; b <= 200; b++) {
                for (c = 1; c <= 200; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + "," + b + "," + c);
                    }
                }
            }

        }
    }
}
