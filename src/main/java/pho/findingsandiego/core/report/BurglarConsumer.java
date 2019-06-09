package pho.findingsandiego.core.report;

import pho.findingsandiego.core.beans.Burglar;

import java.util.function.Consumer;

public class BurglarConsumer implements Consumer<Burglar> {
    @Override
    public void accept(Burglar burglar) {
        System.out.printf("%-30s%-10s%-10s%-10s%-20s%-25s\n",
                burglar.name,
                burglar.gender,
                burglar.hair,
                burglar.eye,
                burglar.occupation,
                burglar.favoriteFood);
    }
}
