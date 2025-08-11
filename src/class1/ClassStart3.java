package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 변수 선언
        student1 = new Student(); // 객체(인스턴스) 생성 → 메모리 할당
        student1.name = "춘배";
        student1.age = 15;
        student1.score = 90;

        Student student2;
        student2 = new Student();
        student2.name = "나비";
        student2.age = 16;
        student2.score = 80;

        Student student3;
        student3 = new Student();
        student3.name = "영철";
        student3.age = 17;
        student3.score = 85;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 점수:" + student1.score);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 점수:" + student2.score);
        System.out.println("이름:" + student3.name + " 나이:" + student3.age + " 점수:" + student3.score);

        // 클래스(Student)를 사용해서 실제 메모리에 만들어진 실체(student1, student2)를 객체 또는 인스턴스라고 한다.
    }
}
