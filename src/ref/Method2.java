package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("춘배", 15, 90);
        Student student2 = createStudent("나비", 16, 80);
        Student student3 = createStudent("영철", 17, 85);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static Student createStudent(String name, int age, int score) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.score = score;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 점수:" + student.score);
    }
}
