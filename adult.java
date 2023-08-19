package myjava;
import java.net.StandardSocketOptions;
import java.util.*;
public class adult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("Not an adult");
        }
    }
}
