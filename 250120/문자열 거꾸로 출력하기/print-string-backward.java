import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String stra = "END";
        for (int i = 0 ; i < 10 ; i++) {
            String str = sc.next();
            if (stra.equals(str)) {
                break;
            }
            for (int j = str.length()-1; j >= 0;j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}