public class Method {
    public static void main(String[] args) {
        // 메소드: 특정 작업을 수행하는 코드 블록, 재사용 가능

        // 메소드 정의
        int sumResult = sum(10, 20);
        System.out.println("Sum: " + sumResult);

        String greeting = greet("Alice");
        System.out.println(greeting);

        // 메소드 오버로딩
        System.out.println("Sum of 3 and 4: " + sum(3, 4));
        System.out.println("Sum of 1.5 and 2.5: " + sum(1.5, 2.5));
    }

    // 메소드 정의
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
