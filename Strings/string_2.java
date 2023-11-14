package String;

public class string_2 {
    public static void main(String[] args) {
        String s="mhupendrajogi";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        String s1="mousecolor";
        System.out.println(s.equals(s1));
        equal_String(s,s1);
        System.out.println(s.compareTo(s1));
        String s4="hello";
        String s5="hello";
        System.out.println(s4.compareTo(s5));
        comapare_String(s,s1);
        comapare_String(s4,s5);
    }

    public  static void comapare_String(String a, String b){
        if (a==b){
            System.out.println("0");
        }
        else{
            for (int i=0;i<a.length();i++){
                if ((int)(a.charAt(i))==(int)(b.charAt(i))){
                    continue;
                }
                else{
                    System.out.println((int)(a.charAt(i))-(int)(b.charAt(i)));
                    break;
                }
            }
        }
    }
    public static void equal_String(String a, String b){
        if (a.length()!=b.length()){
            System.out.println("Not equal");
        }
        else {
            int flag=0;
            for (int i = 0; i < a.length();i++) {
                if (a.charAt(i)==b.charAt(i)){
                    flag=1;
                }
                else{
                    flag=0;
                }
            }
            if (flag==1){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not equal");
            }
        }
    }
}
