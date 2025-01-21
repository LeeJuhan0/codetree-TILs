import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(Fibonacci_sequence(n));
    }

    public static int Fibonacci_sequence(int n) {  
        if(n==2 || n==1) {
            return 1;
        }
        
        return Fibonacci_sequence(n-1) + Fibonacci_sequence(n-2) ; 
        
    }
}