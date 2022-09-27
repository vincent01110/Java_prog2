package Mikulas;

import java.util.ArrayList;
import java.util.List;

public class Puttony implements AjandekCsomag{

    private List<Ajandek> ajandekList = new ArrayList<>();
    //public List<Gyerekjatek> gyerekjatekList = new ArrayList<>();


    // equals nevük= és súly max 1 kiló eltérés

    /**
    public void addGyerekjatek(Gyerekjatek aji){
        gyerekjatekList.add(aji);
    }

    public Gyerekjatek getGyerekjatek(int i){
        return gyerekjatekList.get(i);
    }
     */


    public List<Ajandek> getAjandekList() {
        return ajandekList;
    }

    public void setAjandekList(List<Ajandek> ajandekList) {
        this.ajandekList = ajandekList;
    }

    @Override
    public int osszErtek() {
        return 0;
    }

    @Override
    public int nehezebb(double t) {
        return 0;
    }

    //Nyakkendo, 0.3, 4000Ft     Double.parseDouble
}
