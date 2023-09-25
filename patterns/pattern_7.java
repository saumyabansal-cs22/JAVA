package patterns;

import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int cols=1;
            while(cols<=n){
                if (row==1 || row==n || cols==1 ||cols==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                cols++;
         }
            //next row prep
            row++;
            System.out.println();
       }
    }
}
