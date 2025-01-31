import java.util.Scanner;

public class Main {
    public static char[] arr = new char[10000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            int idx = sc.nextInt();
            char Alp = sc.next().charAt(0);
            arr[idx-1] = Alp;
        }
        int sum = 0 , maxsum =0;
        for(int i = 0 ; i < 10000-k ; i++) {
            for(int j = i ; j < i+k+1 ; j++) {
                if(arr[j] == 'G') {
                    sum += 1;
                }
                else if(arr[j] == 'H') {
                    sum += 2;
                }
            }
            maxsum = Math.max(sum, maxsum);
            sum = 0;
        }
        System.out.print(maxsum);
    }
}