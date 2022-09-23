package Task;

public class Szemely {
    private String nev;
    private int eletkor;
    private boolean ferfi;

    public Szemely() {
    }

    public Szemely(String nev, int eletkor, boolean ferfi) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.ferfi = ferfi;
    }
    
    public void setNev(String nev){
        this.nev = nev;
    }
    public String getNev(){
        return this.nev;
    }
    
    public void setEletkor(int eletkor){
        this.eletkor = eletkor;
    }
    public int getEletkor(){
        return this.eletkor;
    }
    
    public void setFerfi(boolean ferfi){
        this.ferfi = ferfi;
    }
    public boolean getFerfi(){
        return this.ferfi;
    }
    
    @Override
    public String toString(){
        return "Szemely{nev=" + this.nev + ", eletkor=" + this.eletkor + ", ferfi=" + this.ferfi + "}";
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Szemely szemely = (Szemely) o;
        return this.nev == szemely.nev && this.eletkor == szemely.eletkor &&
                this.ferfi == szemely.ferfi;
    }
    
    //konstruktor  3/0 param
    //getter setter
    //toString
    //equals
    //Hallgato class double atlag
    // oktató class string tanszek
    //hallgato: metodus : igaz ha atlag >= 4 else hamis
}
