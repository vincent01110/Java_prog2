package egyetem;

public class Demonstrátor extends Oktató {
    private String szak;

    public Demonstrátor(String név, String neptunKód, String szak){
        super(név, neptunKód, "fiktív tanszék");
        this.szak = szak;
    }

    public String getSzak(){
        return this.szak;
    }

    @Override
    public String toString(){
        return this.név + " (" + this.neptunKód + ") tanszéke: " + this.tanszék + " szak: " + this.szak;
    }

}
