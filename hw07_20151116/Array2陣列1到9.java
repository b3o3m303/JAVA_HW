import java.util.Scanner;
public class Array2°}¦C1¨ì9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int m=1;
        int [][]data=new int[3][3];
               for(int i=0;i<3;i++) {
                   for(int j=0;j<3;j++) {
                      
                       data[i][j]=m;
                       m++;
                   }
               }
               for(int i=0;i<3;i++) {
                   for(int j=0;j<3;j++) {
                       System.out.print(data[i][j]);
                   }System.out.println("");
               }
               
    }

}
