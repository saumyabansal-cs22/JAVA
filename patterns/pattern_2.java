package lec1.patterns;

public class pattern_2 {
    public static void main(String[] args) {
//        for (int i=0;i<5;i++){
//            for(int j=0;j<(i+1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
        int i=0;
//        int j=0;
        while(i<5){
            int j=0;
            while(j<(i+1)) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();

        }
    }
}
