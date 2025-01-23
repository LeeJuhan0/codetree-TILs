import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height, weight, num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
    public Student() {}

    public int compareTo(Student student) {
        if (this.height == student.height) {
            if(this.weight == student.weight) {
                return this.num - student.num;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students_arr = new Student[n];

        for(int i = 0 ; i < n ; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students_arr[i] = new Student(height, weight, i+1);
        }
        Arrays.sort(students_arr);
        for(int i = 0; i < n ; i++) {
            System.out.println(students_arr[i].height+" "+students_arr[i].weight+" "+students_arr[i].num);     
        } 
    }
}