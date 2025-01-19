import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "grape";
        String str4 = "blueberry";
        String str5 = "orange";
        char Alphabet = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 2 ; i < 4 ; i++) {
            if(str1.charAt(i) ==  Alphabet) {
                System.out.println(str1);
                cnt++;
                break;
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            if(str2.charAt(i) ==  Alphabet) {
                System.out.println(str2);
                cnt++;
                break;
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            if(str3.charAt(i) ==  Alphabet) {
                System.out.println(str3);
                cnt++;
                break;
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            if(str4.charAt(i) ==  Alphabet) {
                System.out.println(str4);
                cnt++;
                break;
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            if(str5.charAt(i) ==  Alphabet) {
                System.out.println(str5);
                cnt++;
                break;
            }
        }
        System.out.print(cnt);
    }
}