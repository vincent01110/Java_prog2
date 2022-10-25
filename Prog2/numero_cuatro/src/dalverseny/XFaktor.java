package dalverseny;

import verseny.Verseny;
import verseny.Versenyző;

import java.util.*;

public class XFaktor implements Verseny{
    private int season;
    private Versenyző[] competitors;


    public XFaktor() {
    }

    public XFaktor(int season) {
        this.season = season;
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
        HashSet<Versenyző> versenyzőHashSet = new HashSet<>();
        for(var e : competitors){
            versenyzőHashSet.add(e);
        }
        versenyzőHashSet.add(versenyző);
        competitors = versenyzőHashSet.toArray(new Versenyző[0]);
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
        int egyeni = 0;
        int csapat = 0;
        for (var e : competitors){
            if (e.getClass().getName().equals("Egyéni")){
                egyeni++;
            } else if (e.getClass().getName().equals("Csapat")){
                csapat++;
            }
        }
        int[] szam = {egyeni, csapat};
        return szam;
    }

    public Versenyző[] getCompetitors() {
        return competitors;
    }
}
