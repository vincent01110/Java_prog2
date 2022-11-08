package teszt;

import légiKözlekedés.Legitarsasag;
import repülés.Repülőgép;
import repülés.Utasszallito;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
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
                try {
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
                } catch (IllegalArgumentException e)
                {
                    System.out.println("¡Rossz adat!");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("¡Nincs ilyen file!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("¡Nincs megadva a file neve!");
        }

        System.out.println(repülőgépList);

        Legitarsasag legitarsasag;

        try {
            legitarsasag = new Legitarsasag(args[1], repülőgépList);
        } catch (ArrayIndexOutOfBoundsException e){
            legitarsasag = new Legitarsasag("UnidebAirlines", repülőgépList);
        }


        Scanner scanner = new Scanner(System.in);
        /**
        int ferohely = scanner.nextInt();
        System.out.println(legitarsasag.megfelelőGépek(ferohely));
         */

        String gyarto = scanner.nextLine();
        kiiratas(repülőgépList, gyarto);



    }

    public static void kiiratas(Collection<Repülőgép> repülőgépList, String gyarto){
        for(var e : repülőgépList){
            if (e.getGyarto().equalsIgnoreCase(gyarto)){
                System.out.println(e.getClass() + " " + e);
            }
        }
    }
}
