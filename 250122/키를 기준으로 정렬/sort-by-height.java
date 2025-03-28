import java.util.Scanner;;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int height, weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) { 
        return this.height - student.height;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0 ; i < n ; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students); // 국어 점수 기준 오름차순 정렬

        for(int i = 0; i < n; i++)
            System.out.println(students[i].name + " " + students[i].height + " " + students[i].weight);
    }
}