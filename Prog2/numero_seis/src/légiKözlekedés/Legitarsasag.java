package légiKözlekedés;

import repülés.Flotta;
import repülés.Repülőgép;
import repülés.Utasszallito;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Legitarsasag implements Flotta {
    public String name;
    public List<Repülőgép> repülőgépList;

    public Legitarsasag(String name, List<Repülőgép> repülőgépList) {
        this.name = name;
        this.repülőgépList = repülőgépList;
    }

    @Override
    public void felvesz(Repülőgép repülő) {
        repülőgépList.add(repülő);
    }

    @Override
    public List<Utasszallito> megfelelőGépek(int utasszám) {
        List<Utasszallito> utasszallitoList = new ArrayList<>();
        for(int i = 0; i < repülőgépList.size(); i++){
            if (repülőgépList.get(i).getClass() == Utasszallito.class){
                Utasszallito utasszallito = (Utasszallito) repülőgépList.get(i);
                if (utasszallito.getFerohely() >= utasszám){
                    utasszallitoList.add(utasszallito);
                }
            }
        }
        Collections.sort(utasszallitoList);
        return utasszallitoList;
    }

    @Override
    public void kiír(String fájlnév){
        try {
            FileWriter fileWriter = new FileWriter(new File(fájlnév));
            fileWriter.write(name + "\n");
            for(var e : repülőgépList){
                fileWriter.write(e.toString() + "\n");
            }
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Nincs ilyen file!");
        }
    }

    public void kiirCsakRepulo(){
        List<String> gyartok = new ArrayList<>();
        for(int i = 0; i < repülőgépList.size(); i++){
            if (repülőgépList.get(i).getClass() == Utasszallito.class){
                gyartok.add(repülőgépList.get(i).getGyarto().toLowerCase());
            }
        }

        for(int i = 0; i < repülőgépList.size(); i++){
            if (!gyartok.contains(repülőgépList.get(i).getGyarto().toLowerCase())){
                System.out.println(repülőgépList.get(i));
            }
        }
    }
}
