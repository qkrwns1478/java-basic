package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "춘배", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "나비", 16, 80);

        Student student3 = new Student();
        initStudent(student3, "영철", 17, 85);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static void initStudent(Student student, String name, int age, int score) {
        student.name = name;
        student.age = age;
        student.score = score;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 점수:" + student.score);
    }
}
