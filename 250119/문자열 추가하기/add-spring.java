import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String hello = "Hello";
        String str = sc.next();
        
        str += hello;
        System.out.print(str);
    }
}