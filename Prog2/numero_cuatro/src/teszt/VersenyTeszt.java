package teszt;

import dalverseny.XFaktor;
import verseny.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class VersenyTeszt{
    public static void main(String[] args) throws IOException {
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

        XFaktor xFaktor = new XFaktor(evad, new Versenyző[0]);
        for(var e : versenyzőList){
            if (e.getField().equals("ének")){
                xFaktor.nevez(e);
            }
        }
        System.out.println(xFaktor.toString());

        System.out.print("Adja meg a vissza lépni kívánó versenyző azonosítóját=");
        int visszaId = scanner.nextInt();
        if (xFaktor.visszalép(visszaId) == false){
            System.out.println("A versenyre ilyen versenyző nem jelentkezett");
        } else {
            xFaktor.visszalép(visszaId);
            System.out.println(xFaktor.toString());
        }

        System.out.println("Kérem adja meg a kimeneti állomány nevét=");
        String kiFileNév = scanner.nextLine();
        List<Verseny> versenyList = new ArrayList<>();
        versenyList.add(xFaktor);
        tobbCsapat(versenyList, "src/teszt/ki.txt");


    }
    
    public static void tobbCsapat(Collection<Verseny> versenyek, String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);

        System.out.println("Ezekre a versenyekre több csapat jelentkezett mint egyéni:\n");
        for (var e : versenyek) {
            if (((XFaktor) versenyek).versenyzőkSzáma()[0] < ((XFaktor) versenyek).versenyzőkSzáma()[1]) {
                fileWriter.write(e.toString());
            }
        }
        fileWriter.close();
    }
}
