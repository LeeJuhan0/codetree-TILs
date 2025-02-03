import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int Min = Integer.MAX_VALUE;
        boolean same = true;
        for(int i = 0 ; i < 5 ; i++) {
            for(int j = 0 ; j < 5 ; j++) {
                for(int k= 0; k < 5; k++ ) {
                    for(int a = 0 ; a < 5 ; a++) {
                        for(int b = 0 ; b < 5 ; b++) {    
                            if(i == j || i == k || i == a ||i == b ||  j == k ||j == a || j == b ||k == a || k == b || a == b){
                                continue;
                            }
                            int first = 0, second = 0, third = 0, sum = 0, max = 0, min = 0;
                            first = arr[i]+arr[j];
                            second = arr[k]+arr[a];
                            third = arr[b];
                            max = Math.max(first, Math.max(second, third));
                            min = Math.min(first, Math.min(second, third));
                            sum = max-min;
                            if(first == second || first == third || second == third) {    
                                break;
                            }
                            else{
                                Min = Math.min(Min, sum);
                                same = false;
                            }
                        }   
                    }
                }
            }
        }
        System.out.print((same) ? "-1" : Min);
    }
}