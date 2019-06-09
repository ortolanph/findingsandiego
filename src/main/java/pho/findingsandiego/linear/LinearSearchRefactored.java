package pho.findingsandiego.linear;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchRefactored {

    private List<Burglar> burglars;

    public LinearSearchRefactored(List<Burglar> burglars) {
        this.burglars = burglars;
    }

    public List<Burglar> find(Gender gender, Hair hair, Eye eye, String occupation, String favoriteFood) {
        return filterByFavoriteFood(favoriteFood,
                filterByOccupation(occupation,
                        filterByEye(eye,
                                filterByHair(hair,
                                        filterByGender(gender, burglars)
                                ))));
    }

    private List<Burglar> filterByGender(Gender gender, List<Burglar> burglars) {
        List<Burglar> result = new ArrayList<>();

        if (gender != null) {
            for (Burglar burglar : burglars) {
                if (burglar.gender.equals(gender)) {
                    result.add(burglar);
                }
            }
        } else {
            return burglars;
        }

        return result;
    }

    private List<Burglar> filterByHair(Hair hair, List<Burglar> burglars) {
        List<Burglar> result = new ArrayList<>();

        if (hair != null) {
            for (Burglar burglar : burglars) {
                if (burglar.hair.equals(hair)) {
                    result.add(burglar);
                }
            }
        } else {
            return burglars;
        }

        return result;
    }

    private List<Burglar> filterByEye(Eye eye, List<Burglar> burglars) {
        List<Burglar> result = new ArrayList<>();

        if (eye != null) {
            for (Burglar burglar : burglars) {
                if (burglar.eye.equals(eye)) {
                    result.add(burglar);
                }
            }
        } else {
            return burglars;
        }

        return result;
    }

    private List<Burglar> filterByOccupation(String occupation, List<Burglar> burglars) {
        List<Burglar> result = new ArrayList<>();

        if (occupation != null) {
            for (Burglar burglar : burglars) {
                if (burglar.occupation.equals(occupation)) {
                    result.add(burglar);
                }
            }
        } else {
            return burglars;
        }

        return result;
    }

    private List<Burglar> filterByFavoriteFood(String favoriteFood, List<Burglar> burglars) {
        List<Burglar> result = new ArrayList<>();

        if (favoriteFood != null) {
            for (Burglar burglar : burglars) {
                if (burglar.favoriteFood.equals(favoriteFood)) {
                    result.add(burglar);
                }
            }
        } else {
            return burglars;
        }

        return result;
    }
}
