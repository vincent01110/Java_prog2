package Mikulas;

public class Gyerekjatek extends Ajandek{
    private int korhatar;

    public Gyerekjatek() {
    }

    public Gyerekjatek(String nev, double tomeg, int ar, int korhatar) {
        super(nev, tomeg, ar);
        this.korhatar = korhatar;
    }

    public int getKorhatar() {
        return korhatar;
    }

    public void setKorhatar(int korhatar) {
        this.korhatar = korhatar;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + korhatar + " eves kortol";
    }
}
