package verseny;

public class Egyéni extends Versenyző{
    private int age;

    public Egyéni(int id, String name, String field, int age) {
        super(id, name, field);
        this.age = age;
    }

    @Override
    public String toString() {
        return "egyéni versenyző: " +  super.toString() + ", kora: " + age;
    }
}
