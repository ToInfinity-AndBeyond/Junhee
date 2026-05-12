public class Rep {
    public static void main(String[] args) {
        // 반복문: for, while, do-while

        // for loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // while loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        // do-while loop
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 5);

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
