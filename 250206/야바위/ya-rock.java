import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_a = new int[n];
        int[] arr_b = new int[n];
        int[] arr_c = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr_a[i] = sc.nextInt();
            arr_b[i] = sc.nextInt();
            arr_c[i] = sc.nextInt();
        }
        int max_score = 0;
        for(int i = 1; i <= 3; i++) { // i가 돌이 들어있는 번호
            int score = 0;
            int stone = i;
            for(int j = 0 ; j < n ; j++) {
                if(arr_a[j] == stone) {
                    stone = arr_b[j]; 
                }
                else if(arr_b[j] == stone) {
                    stone = arr_a[j];
                }
                if(arr_c[j] == stone) {
                    score++;
                }
            }
            max_score = Math.max(max_score, score);
        }
        System.out.print(max_score);
    }
}