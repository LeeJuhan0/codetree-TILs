import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[100];
        for(int i = 0 ; i < n ; i++) {
            int idx = sc.nextInt();
            char Alpha = sc.next().charAt(0);
            arr[idx-1] = Alpha;
        }
        int max_disctance = 0;
        for(int i = 0 ; i < 100-1 ; i++) {
            for(int j = i+1 ; j < 100 ; j++) {
                int G_cnt = 0;
                int H_cnt = 0;
                int distance = -1;
                for(int k = i ; k <= j ; k++) {
                    if(arr[i] !='H' && arr[i] != 'G') {                    
                        break;
                    }
                    if(arr[j] != 'G' && arr[j] != 'H') {                    
                        break;
                    }
                    if(arr[k] == 'G') {
                        G_cnt++;
                    }
                    else if(arr[k] == 'H') {
                        H_cnt++;
                    }
                    distance++;
                }
                if(H_cnt == G_cnt) {
                    max_disctance = Math.max(distance, max_disctance);
                }
                else if(H_cnt == 0) {
                    max_disctance = Math.max(distance, max_disctance);
                }
                else if(G_cnt == 0) {
                    max_disctance = Math.max(distance, max_disctance);
                }
                
            }

        }
        System.out.print(max_disctance);   
    }
}