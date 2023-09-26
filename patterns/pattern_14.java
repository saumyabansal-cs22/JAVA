package patterns;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=2*n-1){
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
            //mirror
            if (row<n){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            //next row prep
            row++;
            System.out.println();
        }

    }
}
