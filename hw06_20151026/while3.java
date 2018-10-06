import java.util.Scanner;

public class while3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入分鐘數");
        float time = scn.nextFloat();
        while (true) {
            if (time < 600) {
                time = (float) (time * 0.5);
                System.out.println(time);
            }
            if (time <= 1200 && time >= 600) {
                time = (float) (time * 0.5 * 0.9);
                System.out.println(time);
            }
            if (time > 1200) {
                time = (float) (time * 0.5 * 0.79);
                System.out.println(time);
            }
            break;
        }

    }

}

