package array_sorting;
import java.util.*;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int []arr){
        for (int i=1;i<arr.length;i++){
            insert_element(arr,i);
        }
    }
    public static void insert_element(int []arr,int i){
        int j=i-1;
        int item=arr[i];
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
}