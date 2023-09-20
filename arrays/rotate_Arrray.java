package arrays;

public class rotate_Arrray {
    public static void main(String[] args) {
        int [] arr={4,8,9,6,3,2,7};
        int k=3;
        rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        for (int m = 0; m < k; m++) {

            int item = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = item;
        }
    }
}
