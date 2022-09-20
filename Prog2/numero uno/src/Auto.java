public class Auto {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    /**
     * Konstruktor 0/3 paraméter
     * Getter/Setter
     * toString
     * equals, csak a teljesítményt figyelje
     * 1peldany: 0 paraméter
     * 2példány: 3 paraméter
     * ezeket összehasonlítani
     */

    public Auto(String rendszam, int teljesitmeny, boolean automata){
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public Auto() {}

    public void setRendszam(String rendszam){
        this.rendszam = rendszam;
    }
    public String getRendszam(){
        return this.rendszam;
    }

    public void setTeljesitmeny(int teljesitmeny){
        this.teljesitmeny = teljesitmeny;
    }
    public int getTeljesitmeny(int teljesitmeny){
        return this.teljesitmeny;
    }

    public void setAutomata(boolean automata){
        this.automata = automata;
    }
    public boolean getAutomata(){
        return this.automata;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        Auto auto = (Auto) o;
        return teljesitmeny == auto.teljesitmeny;
    }

    @Override
    public String toString(){
        return "Auto={rendszam=" + rendszam + ", teljesitmeny=" + teljesitmeny + ", automata=" + automata + "}";
    }
}
