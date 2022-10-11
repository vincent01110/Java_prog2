package Chartography;

import java.util.List;

public class Atlasz implements Terkeptar{
    List<Terkep> terkeplist;

    @Override
    public void hozzaad(Terkep[] terkepek) {
           for (int i=0;i<terkepek.length;i++){
               terkeplist.add(terkepek[i]);
           }
    }

    @Override
    public List<Terkep> terkepekk(boolean csaktematikus, int nevekSzama) {
        return null;
    }
}
