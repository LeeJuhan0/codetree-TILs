import java.util.Scanner;

class codename {
    char name;
    int score;

    public codename() {
        this.name = 'a';
        this.score = 0;
    }

    public codename (char name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        codename[] codename = new codename[5];
        int minscore = 100;
        for (int i = 0 ; i < 5 ; i++) {
            char name = sc.next().charAt(0);
            int score = sc.nextInt();
            codename[i] = new codename(name, score);
        }

        for (int i = 0 ; i < 5 ; i++) {
            if (minscore > codename[i].score) {
                minscore = codename[i].score;
            }
        }
        codename lowestcodename = new codename();
        for (int i = 0 ; i < 5 ; i++) {
            if (codename[i].score == minscore) {
                lowestcodename = codename[i];
            }
        }
        System.out.print(lowestcodename.name+" "+lowestcodename.score);

    }
}