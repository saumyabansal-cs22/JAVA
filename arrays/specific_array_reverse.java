package arrays;

public class specific_array_reverse{
    public static void main(String[] args) {
        int[] arr={5,89,6,3,2,70,85,74,96,4};
        reverse(arr,2,6);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(int[] arr,int i,int j){
        //here we'll use two pointer appraoch

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
