public class Array {
    public static void main(String[] args) {
        // 배열: 같은 타입의 여러 값을 저장하는 자료구조

        // 1차원 배열
        int[] numbers = {10, 20, 30, 40, 50};

        int[] numbersAdd = new int[10];

        System.out.println("First element: " + numbers[0]);
        System.out.println("Length of array: " + numbers.length);

        // 2차원 배열
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Element at (1,1): " + matrix[1][1]);
        System.out.println("Number of rows: " + matrix.length);
        System.out.println("Number of columns in first row: " + matrix[0].length);

        // 배열 순회
        System.out.println("\nIterating through numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nIterating through matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
