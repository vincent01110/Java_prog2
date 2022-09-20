package reference_types;

import java.time.LocalDate;

public class reference_types {
    public static void main(String[] args) {
        // Non-primitive data types AKA reference types
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());

        LocalDate now = LocalDate.now();
        System.out.println(now);
    }
}
