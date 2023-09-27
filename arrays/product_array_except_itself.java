package arrays;

public class product_array_except_itself {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] ans=prod(arr);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] prod(int[] arr){  //int[] is the return type for an array
        int n=arr.length;
        int[] left=new int[n];
        left[0]=1;
        for(int i=0;i<left.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        int[] right=new int[n];
        right[n-1]=1;
        for(int i=n-1;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        //answer array
        for(int i=0;i<right.length;i++){
            left[i]=left[i]*right[i];
        }
        return left;

    }
}
