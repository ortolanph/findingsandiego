package pho.findingsandiego.core.converter;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;

import java.util.function.Function;

public class BurglarConverter implements Function<String, Burglar> {

    private static final String SEPARATOR = ",";

    private static final int FIELD_NAME = 0;
    private static final int FIELD_GENDER = 1;
    private static final int FIELD_HAIR = 2;
    private static final int FIELD_EYE = 3;
    private static final int FIELD_OCCUPATION = 4;
    private static final int FIELD_FAVORITE_FOOD = 5;

    public Burglar apply(String data) {
        Burglar burglar = new Burglar();

        String[] fields = data.split(SEPARATOR);

        burglar.name = fields[FIELD_NAME].trim();
        burglar.gender = Gender.valueOf(fields[FIELD_GENDER].toUpperCase().trim());
        burglar.hair = Hair.valueOf(fields[FIELD_HAIR].toUpperCase().trim());
        burglar.eye = Eye.valueOf(fields[FIELD_EYE].toUpperCase().trim());
        burglar.occupation = fields[FIELD_OCCUPATION].trim();
        burglar.favoriteFood = fields[FIELD_FAVORITE_FOOD].trim();

        return burglar;
    }
}
