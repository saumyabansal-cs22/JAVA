package myjava;
import java.util.*;
public class calculator_using_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number = ");
        int a=sc.nextInt();
        System.out.println("enter second number = ");
        int b=sc.nextInt();
        System.out.println("enter the operation: \n 1.Addition \n 2.Subtraction \n 3. Division \n 4. Multiplication");
        int op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            default:
                System.out.println("invalid operation");
                break;
        }

    }
}
