package primitives_vs_reftypes;

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a:" + a + " - b:" + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";
        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);

        mariam.name = "Mariam";
        System.out.println("after changing mariam");
        System.out.println(alex.name + " " + mariam.name);

    }

    static class Person {
        String name;
        Person(String name) { this.name = name; }
    }
}




























