package TwoD_Array;

public class search_in_twod_array {
    public static void main(String[] args) {
        int[] [] arr= {{1, 4, 7, 11, 15},{14,2,3,5,8},{9,10,13,16,18},{12,17,19,20,22}};
        int item=91;
        System.out.println(Search(arr,item));
    }
    public static boolean Search(int[][] arr,int item){
        int r=arr.length-1;
        int c=0;
        while(r>=0 && c<arr[0].length){
            if (arr[r][c]==item){
                return true;
            }
            else if(arr[r][c]>item){
                r--;
            }
            else {
                c++;
            }
        }
        return false;
    }
}
