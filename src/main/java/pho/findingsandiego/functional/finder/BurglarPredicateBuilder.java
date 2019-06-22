package pho.findingsandiego.functional.finder;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;
import pho.findingsandiego.core.beans.Eye;

import java.util.Objects;
import java.util.function.Predicate;

import static pho.findingsandiego.functional.finder.BuilderExceptionMessages.*;

public class BurglarPredicateBuilder {

    private Predicate<Burglar> rootPredicate;

    private static final BurglarPredicateBuilder INSTANCE = new BurglarPredicateBuilder();

    private BurglarPredicateBuilder() {
        rootPredicate = null;
    }

    public static BurglarPredicateBuilder newBurglarPredicate() {
        return INSTANCE;
    }

    public BurglarPredicateBuilder withGender(final Gender gender) {
        Objects.requireNonNull(gender, EXCEPTION_GENDER.getMessage());
        appendPredicate(b -> b.gender.equals(gender));
        return this;
    }

    public BurglarPredicateBuilder withHairColor(final Hair hair) {
        Objects.requireNonNull(hair, EXCEPTION_HAIR.getMessage());
        appendPredicate(b -> b.hair.equals(hair));
        return this;
    }
    
    public BurglarPredicateBuilder withEyeColor(final Eye eye) {
        Objects.requireNonNull(eye, EXCEPTION_EYE.getMessage());
        appendPredicate(b -> b.eye.equals(eye));
        return this;
    }

    public BurglarPredicateBuilder withOccupation(final String occupation) {
        Objects.requireNonNull(occupation, EXCEPTION_OCCUPATION.getMessage());
        appendPredicate(b -> b.occupation.equals(occupation));
        return this;
    }

    public BurglarPredicateBuilder withFavoriteFood(final String favoriteFood) {
        Objects.requireNonNull(favoriteFood, EXCEPTION_FAVORITE_FOOD.getMessage());
        appendPredicate(b -> b.favoriteFood.equals(favoriteFood));
        return this;
    }

    public Predicate<Burglar> buildPredicate() {
        return rootPredicate;
    }

    private void appendPredicate(Predicate<Burglar> predicate) {
        if(rootPredicate == null) {
            rootPredicate = predicate;
        } else {
            rootPredicate.and(predicate);
        }
    }

}
