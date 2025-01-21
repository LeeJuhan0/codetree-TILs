
import java.util.Scanner;

class User {
    String id;
    int level;

    User(){
        this.id = "";
        this.level = 0;
    }

    User(String id,int level){
        this.id = id;
        this.level=level;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        User us = new User();

        us.id = "codetree";
        us.level= 10;

        String id2 = sc.next();
        int level2 = sc.nextInt();

        User us2 = new User();

        us2.id = id2;
        us2.level = level2;

        System.out.println("user "+us.id+" lv "+us.level);
        System.out.println("user "+us2.id+" lv "+us2.level);
    }
}

