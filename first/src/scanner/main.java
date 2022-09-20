package scanner;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName);

        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        int year = LocalDate.now().minusYears(userAge).getYear();
        System.out.print("You were born in " + year);

        if (userAge < 18) {
            System.out.println(" and you are not an adult.");
        } else {
            System.out.println(" and you are an adult.");
        }
    }
}
