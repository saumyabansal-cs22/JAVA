package TwoD_Array;

public class waveprint {
    public static void main(String[] args){

        int[][] arr={{1,5,8,9,4},{60,70,80,90,71},{110,11,13,16,19},{14,154,122,178,160}};
        Waveprint(arr);
    }
    public static void Waveprint(int[][] arr){
        for (int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for (int row=0;row<arr.length;row++){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
            else{
                for (int row= arr.length-1;row>=0;row--){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }
    }
}
