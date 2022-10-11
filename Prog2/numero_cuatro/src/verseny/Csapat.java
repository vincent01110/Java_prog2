package verseny;

import java.util.List;

public class Csapat extends Versenyző{
    private List<String> teammates;

    public Csapat(int id, String name, String field, List<String> teammates) {
        super(id, name, field);
        this.teammates = teammates;
    }

    @Override
    public String toString() {
        return "csapat: " + super.toString() + ", tagjai: " + teammates;
    }
}
