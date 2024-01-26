public class Main {
    public static void main(String[] args) {
        int a = 5 , b = 6 , c = 7 , t ;
        
        t = a ;
        a = c ;
        c = b ;
        b = t ;

        System.out.print(a + "\n" + b + "\n" + c) ;

    }
}