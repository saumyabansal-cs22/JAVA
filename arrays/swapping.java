package arrays;

public class swapping {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,9};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr[0],arr[1]);
    }
    public static void swap(int a,int b){
        int temp=0;
        a=b;
        b=temp;
    }
}
