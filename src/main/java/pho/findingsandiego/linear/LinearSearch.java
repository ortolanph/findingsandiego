package pho.findingsandiego.linear;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    private List<Burglar> burglars;

    public LinearSearch(List<Burglar> burglars) {
        this.burglars = burglars;
    }

    public List<Burglar> find(Gender gender, Hair hair, Eye eye, String occupation, String favoriteFood) {
        List<Burglar> resultList = new ArrayList<>(burglars);

        if(gender != null) {
            List<Burglar> tempList = new ArrayList<>();

            for(Burglar burglar : burglars) {
                if(burglar.gender.equals(gender)) {
                    tempList.add(burglar);
                }
            }

            resultList = tempList;
        }

        if(hair != null) {
            List<Burglar> tempList = new ArrayList<>();

            for(Burglar burglar : resultList) {
                if(burglar.hair.equals(hair)) {
                    tempList.add(burglar);
                }
            }

            resultList = tempList;
        }

        if(eye != null) {
            List<Burglar> tempList = new ArrayList<>();

            for(Burglar burglar : resultList) {
                if(burglar.eye.equals(eye)) {
                    tempList.add(burglar);
                }
            }

            resultList = tempList;
        }

        if(occupation != null) {
            List<Burglar> tempList = new ArrayList<>();

            for(Burglar burglar : resultList) {
                if(burglar.occupation.equals(occupation)) {
                    tempList.add(burglar);
                }
            }

            resultList = tempList;
        }

        if(favoriteFood != null) {
            List<Burglar> tempList = new ArrayList<>();

            for(Burglar burglar : resultList) {
                if(burglar.favoriteFood.equals(favoriteFood)) {
                    tempList.add(burglar);
                }
            }

            resultList = tempList;
        }

        return resultList;
    }



}
