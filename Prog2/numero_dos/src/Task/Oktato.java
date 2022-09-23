package Task;

import java.util.Objects;

public class Oktato extends Szemely {
    String tanszek;

    public Oktato() {
    }

    public Oktato(String nev, int eletkor, boolean ferfi, String tanszek) {
        super(nev, eletkor, ferfi);
        this.tanszek = tanszek;
    }

    public String getTanszek() {
        return tanszek;
    }

    public void setTanszek(String tanszek) {
        this.tanszek = tanszek;
    }

    @Override
    public String toString() {
        return "Oktato{" + "tanszek='" + tanszek + '\'' + "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oktato oktato = (Oktato) o;
        return tanszek == oktato.tanszek;
    }

}
