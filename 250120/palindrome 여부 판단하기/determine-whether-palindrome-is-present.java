import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindrome(str);

    }

    public static void palindrome(String str1) {
        boolean yes = true;
        String str2 = "";
        for (int i = str1.length()-1 ; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        for (int i = 0 ; i<str1.length();i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                yes = false;
            }
        }
        if(yes){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}