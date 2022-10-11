package egyetem;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Egyetem implements Iskola{

    private Collection<Oktató> oktatóColl;

    public Egyetem(Collection<Oktató> collection){
        for(var e : collection){
            this.felvesz(e);
        }
    }


    @Override
    public void felvesz(Oktató oktató) {
        if (!this.oktatóColl.contains(oktató))
        {
            this.oktatóColl.add(oktató);
        }
    }

    @Override
    public Collection<Oktató> oktatók() {
        return this.oktatóColl;
    }
}
