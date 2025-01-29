import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x_arr = new int[n];
        int[] y_arr = new int[n];
        int[] x_newarr = new int[n-1];
        int[] y_newarr = new int[n-1];
        int value = 0,removeIndex = 1;
        int[] value_arr = new int[n];
        int value_idx = 0;

        for(int i = 0 ; i < n ; i++) {
            x_arr[i] = sc.nextInt();
            y_arr[i] = sc.nextInt();
        }
        for(removeIndex = 1 ; removeIndex < n-1 ; removeIndex++) {
            for (int i = 0, j = 0; i < n; i++) {
                if (i == removeIndex) continue; 
                x_newarr[j] = x_arr[i];
                y_newarr[j] = y_arr[i];
                j++;
            }

            for (int i = 1; i < n-1 ; i++) {
                value += Math.abs(x_newarr[i] - x_newarr[i-1]);
                value += Math.abs(y_newarr[i] - y_newarr[i-1]) ;
            }

            value_arr[value_idx] = value;
            value_idx++;
            value = 0;
        }
        int mindistance = value_arr[0];
        for(int i = 0 ; i < n-2 ; i++) {
            if(value_arr[i] <= mindistance){
                mindistance = value_arr[i];
            }
        }
        System.out.print(mindistance);
    }
}

