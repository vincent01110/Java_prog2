package dalverseny;

import verseny.Verseny;
import verseny.Versenyző;

import java.util.Arrays;

public class XFaktor implements Verseny{
    private int season;
    private Versenyző[] competitors;

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
        return false;
    }

    @Override
    public int[] versenyzőkSzáma() {
        return new int[0];
    }

}
