package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"춘배", "나비", "영철"};
        int[] studentAges = {15, 16, 17};
        int[] studentScores = {90, 80, 85};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 점수:" + studentScores[i]);
        }

        // 배열 사용의 한계점 : 한 학생의 데이터가 3개의 배열에 나눠져 있기 때문에 데이터 변경/삭제 과정에서 실수를 할 수 있다.
        // 컴퓨터 입장에서는 문제가 없지만, 사람이 관리하기 좋은 방식은 아니다.
        // 사람이 관리하기 좋은 방식은 '학생'이라는 개념을 하나로 묶고, 각각의 학생 별로 이름, 나이, 점수를 관리하는 것이다.
    }
}
