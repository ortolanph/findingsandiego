package pho.findingsandiego.core;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.loader.Loader;

import java.util.List;

public class Sandbox {

    public static void main(String[] args) throws Exception {
        List<Burglar> burglars = Loader.loadData();

        burglars.forEach(b -> System.out.println(b));
    }
}
