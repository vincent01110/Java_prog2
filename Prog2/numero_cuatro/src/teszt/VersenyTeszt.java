package teszt;

import dalverseny.XFaktor;
import verseny.Csapat;
import verseny.Egyéni;
import verseny.Versenyző;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VersenyTeszt {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the path(\'src/...\') of the file=");
        String filePath = scanner.nextLine();
        File input = new File(filePath);

        Scanner fileScanner = new Scanner(input);
        List<Versenyző> versenyzőList = new ArrayList<>();
        while(fileScanner.hasNextLine()){
            String temp = fileScanner.nextLine();
            String[] split = temp.split(";");
            if(split[0].equals("E")){
                versenyzőList.add(new Egyéni(Integer.parseInt(split[1]),
                                            split[2], split[3],
                                            Integer.parseInt(split[4])));
            }else if(split[0].equals("C")){
                String[] teamMembers = split[4].split(",");
                versenyzőList.add(new Csapat(Integer.parseInt(split[1]),
                                            split[2], split[3],
                                            Arrays.asList(teamMembers)));
            }
        }

        for(var e : versenyzőList){
            System.out.println(e.toString());
        }

        System.out.print("Adja meg az évad számát=");
        int evad = scanner.nextInt();
        if (evad == 0){
            evad = 2018;
        }

        List<Versenyző> singersList = new ArrayList<>();
        for(var e : versenyzőList){
            if (e.getField().equals("ének")){
                singersList.add(e);
            }
        }
        Versenyző[] singers = singersList.toArray(new Versenyző[0]);
        XFaktor xFaktor = new XFaktor(evad, singers);
        System.out.println(xFaktor.toString());

        System.out.print("Adja meg a vissza lépni kívánó versenyző azonosítóját=");
        int visszaId = scanner.nextInt();
        if (xFaktor.visszalép(visszaId) == false){
            System.out.println("A versenyre ilyen versenyző nem jelentkezett");
        } else {
            xFaktor.visszalép(visszaId);
            System.out.println(xFaktor.toString());
        }



    }
}
