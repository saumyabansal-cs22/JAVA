package arrays;

public class reverse_Array {
    public static void main(String[] args) {
        int[] arr={5,89,6,3,2,70};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(int[] arr){
        //here we'll use two pointer appraoch
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
