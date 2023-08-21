package myjava.patterns;

public class empty_box {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                if (j==0||i==0||i==3||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
