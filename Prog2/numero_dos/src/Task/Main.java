package Task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Hallgato h1 = new Hallgato();
        h1.setNev("Kovács János");
        h1.setEletkor(19);
        h1.setFerfi(true);
        h1.setAtlag(4.5);

        Oktato o1 = new Oktato("Halász Ida", 45,false, "BTK");
        System.out.println(h1.toString());
        System.out.println(o1.toString());

        System.out.println("Kap-e pénzt? " + h1.osztondij());


        Egyeten egyetem = new Egyeten();
        egyetem.addHallgato(new Hallgato("Magyar György", 23, true, 3.2));
        egyetem.addHallgato(new Hallgato("Román Anna", 22, false, 4.9));
        egyetem.addOktato(new Oktato("Kovács Julianna", 38, false, "BTK"));
        egyetem.addOktato(new Oktato("Veres István", 56, true, "MK"));

        for (var idk : egyetem.getHallgatoList()) {
            if(idk.osztondij() == true) {
                System.out.println(idk.toString());
            }
        }


    }
}
