import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print((a+b+c)+"\n"+ (a+b+c)/3 + "\n" + ((a+b+c)-(a+b+c)/3));

        // Please write your code here.
    }
}