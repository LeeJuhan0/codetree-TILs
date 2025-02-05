import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max_sum = 0 ,sum ;
        for(int i = x ; i <= y ; i++) {
            if(i < 10) {
                sum = i; 
            }
            else if (i >= 10 && i < 100){
                sum = i%10 + i/10;
            }
            else if (i >= 100 && i < 1000){
                sum = (i%100)%10 + (i%100)/10  + i/100;
            }
            else if (i >= 1000 && i < 10000){
                sum = i%10 + (i%100)/10 + (i%1000)/100  + i/1000;
            }
            else{
                sum = 1;
            }
            max_sum = Math.max(sum, max_sum); 
        }
        System.out.print(max_sum);
    }
}