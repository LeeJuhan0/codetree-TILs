import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        boolean zero = false;

        for(int i = 0 ; i < 10 ; i++){
            arr[i] = sc.next();
        }
        char Alphabet = sc.next().charAt(0);
        for(int i = 0 ; i < 10 ; i++){
            if(arr[i].charAt(arr[i].length()-1) == Alphabet) {
                System.out.println(arr[i]);
                zero = true;
            }
        }
        if(zero==false) {
            System.out.print("None")
        }

    }
}