public class AutoMain {
    public static void main(String[] args){

        Auto auto1 = new Auto();
        Auto auto2 = new Auto("WTC-911", 214, false);
        System.out.println(auto1);
        System.out.println(auto2);

        auto1.setRendszam("ABC-123");
        auto1.setTeljesitmeny(214);
        auto1.setAutomata(true);
        System.out.println(auto1);
        System.out.println(auto1.equals(auto2));
    }
}
