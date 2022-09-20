package loops;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] numbers = {10, 33, 12, 45, 66, 77};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        for (int numb : numbers) {
            System.out.println(numb);
        }
        System.out.println();

        Arrays.stream(numbers).forEach(System.out::println);

        //while (true) {};
        //do {} while (true);

    }
}
