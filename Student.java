public class Student {
    String studentID;
    String name;
    int age;

    // Constructor: Object 생성할 때 호출되는 특별한 메서드, 객체의 초기 상태를 설정
    public Student(String studentID, String name) {
        this.studentID = studentID; // object의 field에 parameter를 할당함.
        this.name = name;
        this.age = 18; // 기본값으로 18 설정;
    }

    public static void main(String[] args) {
        Student Junhee = new Student("S001", "Junhee");
        Student Minseok = new Student("S002", "Minseok");

        System.out.println("Student ID: " + Junhee.studentID + ", Name: " + Junhee.name + ", Age: " + Junhee.age);
        System.out.println("Student ID: " + Minseok.studentID + ", Name: " + Minseok.name + ", Age: " + Minseok.age);
    }
    
}


// git pull: 업데이트된 코드를 로컬로 가져오기
// git add .: 변경된 파일을 스테이징 영역에 추가
// git commit -m "Add Student class with main method": 변경 사항을 커밋하고 메시지 작성
// git push

