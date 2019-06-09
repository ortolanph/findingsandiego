package pho.findingsandiego.core.report;

import pho.findingsandiego.core.beans.Burglar;

import java.util.List;

public class BurglarReport {

    private static final String HEADER = "BURGLAR_OCCUPATION NAME                  GENDER    HAIR      EYE       OCCUPATION          FAVORITE FOOD            ";
    private static final String LINE   = "---------------------------------------------------------------------------------------------------------";
    private static final String FOOTER = "Results: %d record(s)";

    private BurglarConsumer consumer;

    public BurglarReport(BurglarConsumer consumer) {
        this.consumer = consumer;
    }

    public void report(String title, List<Burglar> burglars) {
        System.out.printf("%s\n", title);
        System.out.println(HEADER);
        System.out.println(LINE);
        burglars.forEach(consumer);
        System.out.println(LINE);
        System.out.printf(FOOTER, burglars.size());
        System.out.println("\n");
    }
}
