import java.util.Scanner;

class spy {
    String code;
    char point;
    int time;

    public spy(String code, char point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char point = sc.next().charAt(0);
        int time = sc.nextInt();

        spy seven = new spy(code, point, time);

        System.out.println("secret code : " + seven.code);
        System.out.println("meeting point : " + seven.point);
        System.out.println("time : " + seven.time);
    }
}