package Chartography;

import java.util.List;

public class TematikusTerkep extends Terkep{
    private String tema;

    public TematikusTerkep(String cim, int meretarany, List<String> nevjegyzek, String tema) {
        super(cim, meretarany, nevjegyzek);
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "TematikusTerkep{" +
                "tema='" + tema + '\'' +
                "} " + super.toString();
    }
}
