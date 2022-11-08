package repülés;

import java.util.Comparator;
import java.util.Objects;

public class Repülőgép implements Comparable<Repülőgép> {
    protected String gyarto;
    protected String tipus;
    protected double hossz;
    protected boolean sugarhajtasu;

    public Repülőgép(String gyarto, String tipus, double hossz, boolean sugarhajtasu) {
        if(hossz < 0){
            throw new IllegalArgumentException();
        } else {
            this.gyarto = gyarto;
            this.tipus = tipus;
            this.hossz = hossz;
            this.sugarhajtasu = sugarhajtasu;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repülőgép repülőgép = (Repülőgép) o;
        return gyarto.equalsIgnoreCase(repülőgép.gyarto) && tipus.equalsIgnoreCase(repülőgép.tipus);
    }

    @Override
    public String toString() {
            if (this.sugarhajtasu){
                return this.gyarto + " " + this.tipus + " sugárhajtású repülőgép," + " hossza: " + this.hossz + "m";
            }
        return this.gyarto + " " + this.tipus + " repülőgép," + " hossza: " + this.hossz + "m";
    }

    @Override
    public int hashCode() {
        return Objects.hash(gyarto, tipus);
    }

    public String getGyarto() {
        return gyarto;
    }

    public boolean isSugarhajtasu() {
        return sugarhajtasu;
    }

    @Override
    public int compareTo(Repülőgép o) {
        if (gyarto.compareToIgnoreCase(o.gyarto) != 0){
            return gyarto.compareToIgnoreCase(o.gyarto);
        } else {
            return tipus.compareToIgnoreCase(o.tipus);
        }
    }
}
