package myjava;
import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int counter=1;counter<=num;counter++){
            if (num%counter==0){
                count++;
            }

        }
        if (count==2){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}
