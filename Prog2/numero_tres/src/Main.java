import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UresAllatException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username=");

        try{
            int username = scanner.nextInt();
            System.out.println("username=" + username);
        }catch (Exception e){
            System.out.println("Rossz adattípus");
        }

        /**
        int[] numbers = {1,2,3,4};

        try{
            System.out.println(numbers[5]);
        }catch(Exception e){
            throw new IndexNotFoundException("Bad Index");
        }*/

        List<String> animals = new ArrayList<>();
        if (!animals.isEmpty()){
            //metodus
        }else throw new UresAllatException("List is empty");


    }
}