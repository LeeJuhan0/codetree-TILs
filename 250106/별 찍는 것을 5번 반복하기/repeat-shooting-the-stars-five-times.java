public class Main {
    public static void print10Stars() {
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        for (int i = 1 ; i <=5 ; i++) {
            print10Stars() ;
            System.out.println() ;
        }
    }
}