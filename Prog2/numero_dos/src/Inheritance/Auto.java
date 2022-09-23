package Inheritance;

import java.util.Objects;

public class Auto {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto() {
    }

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rendszam='" + rendszam + '\'' +
                ", teljesitmeny=" + teljesitmeny +
                ", automata=" + automata +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return teljesitmeny == auto.teljesitmeny && automata == auto.automata && rendszam.equals(auto.rendszam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendszam, teljesitmeny, automata);
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    public void setAutomata(boolean automata) {
        this.automata = automata;
    }
}
