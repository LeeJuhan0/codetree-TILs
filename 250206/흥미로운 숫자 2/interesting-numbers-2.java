import java.util.Scanner;

public class Main {
    public static int cnt = 0;
    public static int[] arr = new int[10];
    public static int interesting(int n){
        arr[n%10]++;
        
        if(n < 10) {
            boolean cnt_1 = false;
            for(int i = 0 ; i < 10 ; i++) {
                if(arr[i] != 0){
                    cnt++;
                }
                if(arr[i] == 1){
                    cnt_1 = true;
                }
            }
            
            if(cnt != 2 || !cnt_1) {
                cnt = 0;
                arr = new int[10];
                return 0;
            }
            else if(cnt == 2 && cnt_1) {
                cnt = 0;
                arr = new int[10];
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