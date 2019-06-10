package pho.findingsandiego.functional;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;

import java.util.List;

public class FunctionalSearch {

    private List<Burglar> burglars;

    public FunctionalSearch(List<Burglar> burglars) {
        this.burglars = burglars;
    }

    public List<Burglar> find(Gender gender, Hair hair, Eye eye, String occupation, String favoriteFood) {
        return null;
    }

}
