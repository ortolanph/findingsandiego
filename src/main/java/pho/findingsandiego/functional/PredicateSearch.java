package pho.findingsandiego.functional;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {

    private List<Burglar> burglars;

    private Predicate<Burglar> rootPredicate;

    public PredicateSearch(List<Burglar> burglars) {
        this.burglars = burglars;
    }

    public Predicate<Burglar> buildSearch(Gender gender, Hair hair, Eye eye, String occupation, String favoriteFood) {
        if(gender != null) {
            addGenderPredicate(gender);
        }

        if(hair != null) {
            addHairPredicate(hair);
        }

        if(eye != null) {
            addEyePredicate(eye);
        }

        if(occupation != null) {
            addOccupationPredicate(occupation);
        }

        if(favoriteFood != null) {
            addFavoriteFoodPredicate(favoriteFood);
        }

        return rootPredicate;
    }

    private void addGenderPredicate(Gender gender) {
        if(rootPredicate == null) {
            rootPredicate = b -> b.gender.equals(gender);
        } else {
            rootPredicate = rootPredicate.and(b -> b.gender.equals(gender));
        }
    }

    private void addHairPredicate(Hair hair) {
        if(rootPredicate == null) {
            rootPredicate = b -> b.hair.equals(hair);
        } else {
            rootPredicate = rootPredicate.and(b -> b.hair.equals(hair));
        }
    }

    private void addEyePredicate(Eye eye) {
        if(rootPredicate == null) {
            rootPredicate = b -> b.eye.equals(eye);
        } else {
            rootPredicate = rootPredicate.and(b -> b.eye.equals(eye));
        }
    }

    private void addOccupationPredicate(String occupation) {
        if(rootPredicate == null) {
            rootPredicate = b -> b.occupation.equals(occupation);
        } else {
            rootPredicate = rootPredicate.and(b -> b.occupation.equals(occupation));
        }
    }

    private void addFavoriteFoodPredicate(String favoriteFood) {
        if(rootPredicate == null) {
            rootPredicate = b -> b.favoriteFood.equals(favoriteFood);
        } else {
            rootPredicate = rootPredicate.and(b -> b.favoriteFood.equals(favoriteFood));
        }
    }
}
