package Chartography;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Terkep {
    private String cim;
    private int meretarany;
    private List<String> nevjegyzek;


    public Terkep(String cim, int meretarany, List<String> nevjegyzek) {
        this.cim = cim;

        if (this.meretarany < 0) {
            throw new IllegalArgumentException("A méretarány kisseb mint 0");
        } else {
            this.meretarany = meretarany;
        }
        this.nevjegyzek = nevjegyzek;
    }

    public Terkep() {
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getMeretarany() {
        return meretarany;
    }

    public void setMeretarany(int meretarany) {
        this.meretarany = meretarany;
    }

    public List<String> getNevjegyzek() {
        return nevjegyzek;
    }

    public void setNevjegyzek(List<String> nevjegyzek) {
        this.nevjegyzek = nevjegyzek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terkep terkep = (Terkep) o;
        return meretarany == terkep.meretarany && Objects.equals(cim, terkep.cim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cim, meretarany, nevjegyzek);
    }

    @Override
    public String toString() {
        return "Terkep{" +
                "cim='" + cim + '\'' +
                ", meretarany=" + "1:" + meretarany +
                ", nevjegyzek=[" + nevjegyzek + "]" +
                '}';
    }

    public boolean nagybetusit(){
        boolean ugyanaz;
        ugyanaz = false;
        for (int i = 0; i < nevjegyzek.size(); i++) {
            char a = nevjegyzek.get(i).toUpperCase().charAt(0);
            char b = nevjegyzek.get(i).charAt(0);
            System.out.println(nevjegyzek.set(i,nevjegyzek.get(i).substring(0,1).toUpperCase()));
            if (a == b)
                ugyanaz = true;
        }
        return ugyanaz;

    }
}

