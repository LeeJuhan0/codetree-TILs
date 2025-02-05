import java.util.Scanner;

public class Main {
    public static int cnt = 0;
    public static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int interesting(int n){
        for(int i = 0 ; i < 10 ; i++) {
            if(arr[i] == n%10){
                arr[i] = -1;
            }
        }
        
        if(n < 10) {
            for(int i = 0 ; i < 10 ; i++) {
                if(arr[i] == -1){
                    cnt++;
                }
        }
            if(cnt != 2) {
                cnt = 0;
                arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                return 0;
            }
            else if(cnt == 2) {
                cnt = 0;
                arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                return 1;
            }   
        }
        return interesting(n/10);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        for(int i = x ; i <= y ; i++) {
            sum += interesting(i);
        }
        System.out.print(sum);
    }
}