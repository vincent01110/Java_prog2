package verseny;

import java.util.Objects;

public abstract class Versenyző {
    protected int id;
    protected String name;
    protected String field;

    public Versenyző(int id, String name, String field) {
        this.id = id;
        this.name = name;
        this.field = field;
    }

    public Versenyző() {
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Versenyző versenyző = (Versenyző) o;
        return this.id == versenyző.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, field);
    }

    @Override
    public String toString() {
        //<név> (<terület>), azonosítója: <azonosító>
        return name + " (" + field + "), azonosítója: " + id;
    }
}
