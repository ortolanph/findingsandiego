package pho.findingsandiego.functional;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalSearch {

    private List<Burglar> burglars;

    public FunctionalSearch(List<Burglar> burglars) {
        this.burglars = burglars;
    }

    public List<Burglar> find(Gender gender, Hair hair, Eye eye, String occupation, String favoriteFood) {
        return filterByGender(gender,
                filterByHair(hair,
                        filterByEye(eye,
                                filterByOccupation(occupation,
                                        filterByFavoriteFood(favoriteFood,
                                                burglars)))));
    }

    private List<Burglar> filterByGender(Gender gender, List<Burglar> burglars) {
        return (gender != null) ?
                burglars.stream().filter(b -> b.gender.equals(gender)).collect(Collectors.toList()) :
                burglars;
    }

    private List<Burglar> filterByHair(Hair hair, List<Burglar> burglars) {
        return (hair != null) ?
                burglars.stream().filter(b -> b.hair.equals(hair)).collect(Collectors.toList()) :
                burglars;
    }

    private List<Burglar> filterByEye(Eye eye, List<Burglar> burglars) {
        return (eye != null) ?
                burglars.stream().filter(b -> b.eye.equals(eye)).collect(Collectors.toList()) :
                burglars;
    }

    private List<Burglar> filterByOccupation(String occupation, List<Burglar> burglars) {
        return (occupation != null) ?
                burglars.stream().filter(b -> b.occupation.equals(occupation)).collect(Collectors.toList()) :
                burglars;
    }

    private List<Burglar> filterByFavoriteFood(String favoriteFood, List<Burglar> burglars) {
        return (favoriteFood != null) ?
                burglars.stream().filter(b -> b.favoriteFood.equals(favoriteFood)).collect(Collectors.toList()) :
                burglars;
    }
}
