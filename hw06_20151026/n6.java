import java.util.Scanner;
public class n6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("請輸入正整數n");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0,m=1;
        while(m<=n) {
           sum=(int) (sum+Math.pow(2,m));
           m++;
            
            
        }System.out.println((int)sum);
    }   

}
