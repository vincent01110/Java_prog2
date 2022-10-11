package teszt;

import Chartography.TematikusTerkep;
import Chartography.Terkep;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Teszt {
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
        System.out.print("Kérlek add meg a bemeneti File nevét=");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        File beFile = new File(filePath);
        Scanner fileScanner = new Scanner(beFile);

        List<Terkep> terkepList = new ArrayList<>();
        while(fileScanner.hasNextLine()){
            String splt = fileScanner.nextLine();
            String[] temp = splt.split(";");
            if (temp.length == 2){
                terkepList.add(new Terkep(temp[0], Integer.parseInt(temp[1].substring(2))));
            }else {
                String[] nevjegyzek = temp[2].split(":");
                List<String> nevlista = Arrays.asList(nevjegyzek);
                // Arrays.stream(temp[2].split(":")).toList();
                if (temp.length == 3) {
                    terkepList.add(new Terkep(temp[0], Integer.parseInt(temp[1].substring(2)), nevlista));
                }
                if (temp.length == 4) {
                    terkepList.add(new TematikusTerkep(temp[0], Integer.parseInt(temp[1].substring(2)),
                            nevlista, temp[3]));
                }
            }

        }

        for (var e : terkepList){
            System.out.println(e.toString());
        }
    }
}
