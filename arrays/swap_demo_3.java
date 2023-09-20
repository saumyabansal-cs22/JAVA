package arrays;

public class swap_demo_3 {
    public static void main(String[] args) {
        int[] arr={3,4,1,7,8};
        int[] arr2={30,40,10,70,80};
        System.out.println(arr[0]+" "+arr2[0]);
        swap(arr,arr2);
        System.out.println(arr[0]+" "+arr2[0]);
    }
    public static void swap(int[] arr,int[] arr2){
        int[] temp=arr;
        arr=arr2;
        arr2=temp;
    }
}
