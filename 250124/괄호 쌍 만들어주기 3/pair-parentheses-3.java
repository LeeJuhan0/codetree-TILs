import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        String str = sc.next();

        for(int i = 0 ; i < str.length() ; i++) {
            arr[i] = str.charAt(i);
        }
        int end_index = str.length(), sum = 0;
        boolean start = false;
        for(int i = 0 ; i < end_index ; i++) {
            if (arr[i] == '(') {
                start = true;
            }
            for(int j = i ; j < end_index ; j++) {
                if (start && arr[j] == ')') 
                    sum++;
            }
            start = false;
        }
        System.out.print(sum);
    }
}