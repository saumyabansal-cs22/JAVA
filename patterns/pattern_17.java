package patterns;

import java.util.Scanner;

public class pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n/2;
        int space=1;
        while(row<=n){
            //star
            int k=0;
            while(k<star){
                System.out.print("* ");
                k++;
            }
            //space
            int m=0;
            while(m<space){
                System.out.print("  ");
                m++;
            }
            //star
            int l=0;
            while(l<star){
                System.out.print("* ");
                l++;
            }
            if (row<=(n/2)){
                space=space+2;
                star--;
            }
            else {
                space=space-2;
                star++;
            }
            //next row prep
            row++;
            System.out.println();
        }
    }
}
