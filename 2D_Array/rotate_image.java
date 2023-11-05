package TwoD_Array;

public class rotate_image {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        Transpose(arr);
        reverse_row(arr);
    }
    public static void Transpose(int[][] arr){
        for (int row=0;row<arr[0].length;row++){
            for (int col=row+1;col< arr[0].length;col++){
                int temp=arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
            }
        }

    }
    public static void reverse_row(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = arr[0].length-1; j >=0; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
