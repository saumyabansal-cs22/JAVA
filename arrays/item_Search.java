package arrays;

import java.util.Scanner;

public class item_Search {
    public static void main(String[] args) {
        int[] arr={2,5,7,8,9,6};
//        System.out.println(arr);
        Scanner sc=new Scanner(System.in);
        int item=sc.nextInt();
        int i=0;
        while(i<arr.length){
            if (arr[i]==item){
                System.out.println(arr[i]+" found at "+i);
            }
            i++;
        }
    }

}
