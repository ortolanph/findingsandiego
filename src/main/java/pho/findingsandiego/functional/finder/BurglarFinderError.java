package pho.findingsandiego.functional.finder;

public class BurglarFinderError {

    public static void main(String[] args) {
        BurglarPredicateBuilder
            .newBurglarPredicate()
            .withGender(null);
    }
}
