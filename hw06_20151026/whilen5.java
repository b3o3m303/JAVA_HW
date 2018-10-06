import java.util.Scanner;
public class whilen5 {
//
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入正整數n:");
        int n=scn.nextInt();
        double sum=0,a=1;
        while(n>=a){
            sum =sum+1.0/(((2*a)-1)*(2*a));
            a++;
        }System.out.println(sum);
        
    }

}
