package arrays;

import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Disp(arr);
    }
    public static void Disp(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
