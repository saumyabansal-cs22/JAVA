package lec1.patterns;

public class pattern_4 {
    public static void main(String[] args) {
        int n=5;
        int i=0;
//        int j=0;
        while(i<=n){
            int j=0;
            while(j<=n) {
                if ((i+j)<(n+1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
                j++;
            }
            i++;
            System.out.println();

        }
    }
}
