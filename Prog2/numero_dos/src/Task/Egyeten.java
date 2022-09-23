package Task;

import java.util.ArrayList;
import java.util.List;

public class Egyeten {
    private List<Hallgato> hallgatoList = new ArrayList<>();
    private List<Oktato> oktatoList = new ArrayList<>();

    public Egyeten(List<Hallgato> hallgato, List<Oktato> oktato){
        this.hallgatoList = hallgato;
        this.oktatoList = oktato;
    }

    public Egyeten(){

    }


    public void addHallgato(Hallgato hallgato){
        hallgatoList.add(hallgato);
    }

    public void addOktato(Oktato oktato){
        oktatoList.add(oktato);
    }

    public List<Hallgato> getHallgatoList() {
        return hallgatoList;
    }

    public void setHallgatoList(List<Hallgato> hallgatoList) {
        this.hallgatoList = hallgatoList;
    }

    public List<Oktato> getOktatoList() {
        return oktatoList;
    }

    public void setOktatoList(List<Oktato> oktatoList) {
        this.oktatoList = oktatoList;
    }
}
