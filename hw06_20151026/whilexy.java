import java.util.Scanner;

public class whilexy {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("½Ð¿é¤JX:");
        int x = scn.nextInt();
        int y = 0;
        while (true) {
            if (x < -1) {
                y = 3 * (x*x);
                System.out.println(y);
            }else
            if (x <= 1 && x >= -1) {
                y = x *x*x + 3 * x - 3;
                System.out.println(y);
            }else
           
            if (x > 1) {
                y = 2 * x + 3;
                System.out.println(y);
            }
            break;
        }
    }

}
