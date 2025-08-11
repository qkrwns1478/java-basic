package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        student1.name = "춘배";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student(); // x002
        student2.name = "나비";
        student2.age = 16;
        student2.score = 80;

        Student student3 = new Student();
        student3.name = "영철";
        student3.age = 17;
        student3.score = 85;

        // **자바에서 대입은 항상 변수에 들어 있는 값을 복사한다!**
        // 변수에는 인스턴스 자체가 들어가는 것이 아니라 인스턴스의 위치를 가리키는 참조값이 들어간다.
        // 대입 시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.

        Student[] students = new Student[3]; // x005
        students[0] = student1; // students[0] = x001;
        students[1] = student2; // students[1] = x002;
        students[2] = student3;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 점수:" + students[0].score);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 점수:" + students[1].score);
        System.out.println("이름:" + students[2].name + " 나이:" + students[2].age + " 점수:" + students[2].score);
    }
}
