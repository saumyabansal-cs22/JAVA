package myjava.patterns;

public class forward_triangle {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for (int j=1;j<(i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
