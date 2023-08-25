package patterns;

public class pattern_10 {
    public static void main(String[] args) {
        int n=5;
        int star=2*n-1;
        int space=0;
        int row=1;
        while(row<=n){
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            //next row prep
            row++;
            star=star-2;
            space+=1;
            System.out.println();
        }
    }
}
