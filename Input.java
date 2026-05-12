import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Scanner 클래스 사용하기
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();

        // nextInt(): int, next() / nextLine(): String (next는 공백 전까지 String, nextLine은 한 줄 전체 String); nextDouble(): double, nextBoolean(): boolean
        
    }
}
