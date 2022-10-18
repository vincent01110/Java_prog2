package dalverseny;

import verseny.Verseny;
import verseny.Versenyző;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XFaktor implements Verseny{
    private int season;
    private Versenyző[] competitors;


    public XFaktor() {
    }

    public XFaktor(int season, Versenyző[] competitors) {
        this.season = season;
        this.competitors = competitors;
    }

    @Override
    public String toString() {
        return "XFaktor - " + season + "\n" +  Arrays.toString(competitors);
    }

    @Override
    public void nevez(Versenyző versenyző) {

    }

    @Override
    public boolean visszalép(int azonosító) {
        List<Versenyző> temp = new ArrayList<>();
        boolean bennevane = false;
        for (var e : competitors){
            if (e.getId() == azonosító){
                bennevane = true;
            }
        }
        if (bennevane == false){
            return false;
        }
        for(var e : competitors){
            if (e.getId() != azonosító){
                temp.add(e);
            }
        }
        competitors = temp.toArray(new Versenyző[0]);
        return true;
    }

    @Override
    public int[] versenyzőkSzáma() {
        return new int[0];
    }

}
