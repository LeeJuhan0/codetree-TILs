import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int max , min;
        if ((int)a>=(int)b) {
            max = (int)a;
            min = (int)b;
        }
        else{
            max = (int)b;
            min = (int)a;
        }
        System.out.println((max+min)+" "+(max-min));
    }
}
