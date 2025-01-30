import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        String cow = sc.next();
        char[] arr = new char[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = cow.charAt(i);
        }
        int cnt = 0 ;
        for(int i = 0 ; i < n-2 ; i++) {
            for(int j = i+1 ; j < n-1 ; j++) {
                for(int k = j+1 ; k < n ; k++) {
                    if(arr[i] == 'C' && arr[j] == 'O' && arr[k] == 'W') {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}