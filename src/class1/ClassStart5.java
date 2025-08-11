package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "춘배";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student();
        student2.name = "나비";
        student2.age = 16;
        student2.score = 80;

        Student student3 = new Student();
        student3.name = "영철";
        student3.age = 17;
        student3.score = 85;

        Student[] students = {student1, student2, student3};

        /* for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 점수:" + students[i].score);
        } */

        for (Student s : students) { // iter
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 점수:" + s.score);
        }
    }
}
