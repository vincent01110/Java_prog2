package beugró;

import egyetem.Demonstrátor;
import egyetem.Oktató;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Beugró {
    public static void main(String[] args) {
        HashSet<Oktató> oktatóHash = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String temp = scanner.nextLine();
            String[] split = temp.split(",");
            if((i+1) % 2 == 0){
                oktatóHash.add(new Demonstrátor(split[0], split[1], split[2]));
            }else {
                oktatóHash.add(new Oktató(split[0], split[1], split[2]));
            }

        }
        for(var idk : oktatóHash){
            System.out.println(idk.toString());
        }

        System.out.println(vane(oktatóHash, "FSZOP0"));

        for(var idk : infotanar(oktatóHash)){
            System.out.println(idk);
        }
    }

   public static Demonstrátor[] infotanar(Collection<Oktató> kollekcio){
        int count = 0;
       for (var e : kollekcio){
           if (e.getTanszék() == "fiktív tanszék"){
               Demonstrátor a = (Demonstrátor) e;
               if (a.getSzak().equals("informatikatanár")) {
                   count++;
               }
           }
       }
        Demonstrátor[] temp = new Demonstrátor[count];
        int i = 0;
        for (var e : kollekcio){
            if (e.getTanszék() == "fiktív tanszék"){
                Demonstrátor a = (Demonstrátor) e;
                if (a.getSzak().equals("informatikatanár")) {
                    temp[i] = a;
                    i++;
                }
            }
        }
        return temp;

    }

    public static String vane (Collection<Oktató> kollekcio, String kod){
        for (var e : kollekcio){
            if (e.getNeptunKód().equals(kod)){
                return "név=" + e.getNév() + ", tanszék=" + e.getTanszék();
            }
        }
        return "nincs ilyen oktató";
    }
}
