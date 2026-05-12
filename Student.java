public class Student {
    String studentID;
    String name;
    int age;

    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student Junhee = new Student("S001", "Junhee", 18);
        Student Minseok = new Student("S002", "Minseok", 24);

        System.out.println("Student ID: " + Junhee.studentID + ", Name: " + Junhee.name + ", Age: " + Junhee.age);
        System.out.println("Student ID: " + Minseok.studentID + ", Name: " + Minseok.name + ", Age: " + Minseok.age);
    }
    
}
