package Task;

public class Hallgato extends Szemely {
    private double atlag;

    public Hallgato(){

    }
    public Hallgato(String nev, int eletkor, boolean ferfi, double atlag){
        super(nev, eletkor, ferfi);
        this.atlag = atlag;
    }

    public void setAtlag(double atlag) { this.atlag = atlag; }
    public double getAtlag() { return this.atlag; }

    @Override
    public String toString(){
        return "Hallgato{atlag=" + this.atlag + "} " + super.toString();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) { return true; }
        if(o == null || this.getClass() != o.getClass()) { return false; }
        if(!super.equals(o)) return false;
        Hallgato hallgato = (Hallgato) o;
        return this.atlag == hallgato.atlag;
    }



    public boolean osztondij(){
        if (this.atlag >= 4){
            return true;
        }
        return false;
    }
}
