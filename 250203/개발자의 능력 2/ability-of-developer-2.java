import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0 ; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int Min = Integer.MAX_VALUE;
        for(int i = 0 ; i < 6 ; i++) {
            for(int j = 0 ; j < 6 ; j++) {
                for(int k= 0; k < 6; k++ ) {
                    for(int a = 0 ; a < 6 ; a++) {
                        for(int b = 0 ; b < 6 ; b++) {
                            for(int c = 0; c < 6; c++ ) {
                                if(i == j || i == k || i == a ||i == b || i == c || j == k ||j == a || j == b || j == c ||k == a || k == b || k == c || a == b || a == c || b == c){
                                    continue;
                                }
                                int first = 0, second = 0, third = 0, sum = 0, max = 0, min = 0;
                                first = arr[i]+arr[j];
                                second = arr[k]+arr[a];
                                third = arr[b]+arr[c];
                                max = Math.max(first, Math.max(second, third));
                                min = Math.min(first, Math.min(second, third));
                                sum = max-min;
                                Min = Math.min(Min, sum);
                            }
                        }   
                    }
                }
            }
        }
        System.out.print(Min);
    }
}