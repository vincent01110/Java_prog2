package teszt;

import repülés.Repülőgép;
import repülés.Utasszallito;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepülőTeszt {
    public static void main(String[] args) {
        List<Repülőgép> repülőgépList = new ArrayList<>();
        try {
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                String[] adatok = data.split(";");
                if (adatok[0].equals("R")){
                    repülőgépList.add(new Repülőgép(
                            adatok[1],
                            adatok[2],
                            Double.parseDouble(adatok[3]),
                            Boolean.parseBoolean(adatok[4])));
                }
                if (adatok[0].equals("U")){
                    repülőgépList.add(new Utasszallito(
                            adatok[1],
                            adatok[2],
                            Double.parseDouble(adatok[3]),
                            Boolean.parseBoolean(adatok[4]),
                            Integer.parseInt(adatok[5])));
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
