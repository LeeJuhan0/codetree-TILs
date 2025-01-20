import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        arr2[0] = arr1[0];
        arr2[1] = arr1[1];

        for (int i = 0 ; i < arr2.length ; i++) {
            System.out.print(arr2[i]);
        } 
    }
}