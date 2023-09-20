package arrays;

public class max_value {
    public static void main(String[] args) {
        int[] arr={1,5,89,584,7};
        System.out.println(maxx(arr));
    }
//    public static int max(int [] arr){
//        int m=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if (arr[i]>m){
//                m=arr[i];
//            }
//
//        }
//        return m;
//    }
    public static int maxx(int[] arr) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            m = Math.max(arr[i], m);
        }
        return m;
    }
}
