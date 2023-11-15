package String;

public class possible_string {
    public static void main(String[] args) {
        String str="Hello";
        String str2="Nitin";
        String_sub(str);
        pali(str);
        pali(str2);
    }
    public static void String_sub(String a){
        int n=a.length();
        for (int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(a.substring(i,j));
            }
        }
    }
    public static void pali(String a){
        int n=a.length();
        int m=n/2;
        for (int i=0;i<m;i++){
            if (a.charAt(i)==a.charAt(n-i-1)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }
        }
    }
}

