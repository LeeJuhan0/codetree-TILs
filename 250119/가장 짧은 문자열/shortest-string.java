import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        int max, min;

        if (word1.length() >= word2.length() && word1.length() >= word3.length()) {
            max = word1.length();
        } 
        else if (word2.length() >= word3.length()) {
            max = word2.length();
        }
        else {
            max = word3.length();
        }

        if (word1.length() <= word2.length() && word1.length() <= word3.length()) {
            min = word1.length();
        } 
        else if (word2.length() <= word3.length()) {
            min = word2.length();
        }
        else {
            min = word3.length();
        }

        System.out.print(max-min);
    }
}