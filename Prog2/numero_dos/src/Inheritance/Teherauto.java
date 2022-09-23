package Inheritance;

import java.util.Objects;

public class Teherauto extends Auto {
    private int teherbiras;


    public Teherauto(String rendszam, int teljesitmeny, boolean automata, int teherbiras) {
        super(rendszam, teljesitmeny, automata);
        this.teherbiras = teherbiras;
    }

    @Override
    public String toString() {
        return "Teherauto{" +
                "teherbiras=" + teherbiras +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teherauto teherauto = (Teherauto) o;
        return teherbiras == teherauto.teherbiras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teherbiras);
    }

    public int getTeherbiras() {
        return teherbiras;
    }

    public void setTeherbiras(int teherbiras) {
        this.teherbiras = teherbiras;
    }
}
