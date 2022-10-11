package egyetem;

public class Oktató implements Comparable {
    protected String név, neptunKód, tanszék;

    public Oktató(){

    }

    public Oktató(String név, String neptunKód, String tanszék){
        this.név = név;
        this.neptunKód = neptunKód;
        this.tanszék = tanszék;
    }

    public String getNév(){
        return this.név;
    }
    public String getNeptunKód(){
        return this.neptunKód;
    }
    public String getTanszék(){
        return this.tanszék;
    }

    @Override
    public String toString(){
        return this.név + " (" + this.neptunKód + ") tanszéke: " + this.tanszék;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(this.getClass() != o.getClass()) return false;
        Oktató oktato = (Oktató) o;
        return this.neptunKód == oktato.neptunKód;
    }


    @Override
    public int compareTo(Object o) {
        Oktató oktato = (Oktató) o;
        if (this.név == oktato.név){
            return 1;
        }
        return 0;
    }
}
