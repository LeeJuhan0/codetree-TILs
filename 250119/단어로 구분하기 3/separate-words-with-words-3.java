import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for(int i = 9 ; i >= 0 ; i--){
            System.out.println(arr[i]);
        }

    }
}