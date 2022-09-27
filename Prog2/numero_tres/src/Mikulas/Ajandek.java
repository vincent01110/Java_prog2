package Mikulas;

public class Ajandek {
    private String nev;
    private double tomeg;
    private int ar;

    public Ajandek(){

    }

    public Ajandek(String nev, double tomeg, int ar) {
        this.nev = nev;
        this.tomeg = tomeg;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getTomeg() {
        return tomeg;
    }

    public void setTomeg(double tomeg) {
        this.tomeg = tomeg;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return nev + "(" + tomeg + "), " + ar + "Ft";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;
        Ajandek e = (Ajandek) o;
        if (e.getNev() == this.getNev() || Math.abs((double) (e.getTomeg() - this.getTomeg())) < 1){
            return true;
        }
        else{
            return false;
        }
    }

    //getter, setter, toString(PL::Nyakkendo(0.3kg), 4000Ft)
    // Ajandek > Gyerekjatek: int korhatar; toString(PL::Nyakkendo(0.3kg), 4000Ft, 8 eves kortol)
}
