package Mikulas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotEnoughArgument {
        Ajandek ajandek = new Ajandek("PS",5.4,180000);
        System.out.println(ajandek.toString());

        Gyerekjatek gyerekjatek = new Gyerekjatek("Optimus Prime", 0.4, 25000, 3);
        System.out.println(gyerekjatek.toString());

        Scanner scanner = new Scanner(System.in);
        Puttony puttony = new Puttony();

        /**
        for (int i = 0; i < 5; i++){
            String beolv = scanner.nextLine();
            String[] present = beolv.split(",");
            if (present.length == 3){
                Ajandek tempAjandek = new Ajandek(present[0],
                        Double.parseDouble(present[1]),
                        Integer.parseInt(present[2]));
                puttony.getAjandekList().add(tempAjandek);
            } else if (present.length == 4) {

            } else if (present.length < 3 || present.length > 4){
                throw new NotEnoughArgument("Nincs elég argumentum");
            }
        }

        int j = 0;
        for (var ki : puttony.getAjandekList()){
            System.out.println(puttony.getAjandekList().get(j));
            j++;
        }
         */

        System.out.println(new Ajandek("Nyakkendo",0.1,2000).equals(
                            new Ajandek("Nyakkendo",0.6,2000)));


    }
}
