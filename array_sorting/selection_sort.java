package array_sorting;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={2,4,5,82,1,6};
        sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=min_val(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    public static int min_val(int[] arr,int i){
        int mini=i;
        for(int k=i+1;k<arr.length;k++){
            if(arr[k]<arr[mini]){
                mini=k;
            }
        }
        return mini;
    }
}
