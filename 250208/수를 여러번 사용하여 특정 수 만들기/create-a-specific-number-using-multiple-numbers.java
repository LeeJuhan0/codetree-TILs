import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max_factor = 0;
        for(int i = 0 ; i < 1000; i++) {
            for(int j = 0 ; j < 1000; j++) {
                int factor = a*i + b*j;
                if(factor <= c) {
                    max_factor = Math.max(factor,max_factor);
                }
            }   
        }
        System.out.print(max_factor);
    }
}