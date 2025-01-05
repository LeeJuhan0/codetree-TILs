import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b = 0 , c = 0, d = 0 ;
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i%12==0) {
                d += 1;
            }
            else if (i%3==0) {
                c += 1;
            }
            else if (i%2==0) {
                b += 1;
            }
        }

        System.out.print(b+" "+c+" "+d);
        
    }
}