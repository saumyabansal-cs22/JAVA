package patterns;

import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while(row<=n){
            //space
            int k=0;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            //star
            int i=0;
            while(i<star){
                System.out.print("* ");
                i++;
            }
            //next row prep
            row++;
            star--;
            space=space+2;
            System.out.println();
        }

    }
}
