package pho.findingsandiego.core.report;

import pho.findingsandiego.core.beans.Burglar;

import java.util.List;

public class BurglarReport {

    private static final String HEADER = "%-30s%-10s%-10s%-10s%-20s%-25s\n";
    private static final String LINE   = "---------------------------------------------------------------------------------------------------------";
    private static final String FOOTER = "Results: %d record(s)";

    private BurglarConsumer consumer;

    public BurglarReport(BurglarConsumer consumer) {
        this.consumer = consumer;
    }

    public void report(String title, List<Burglar> burglars) {
        System.out.printf("%s\n", title);
        System.out.printf(HEADER, "NAME", "GENDER", "HAIR", "EYE", "OCCUPATION", "FAVORITE FOOD");
        System.out.println(LINE);
        burglars.forEach(consumer);
        System.out.println(LINE);
        System.out.printf(FOOTER, burglars.size());
        System.out.println("\n");
    }
}
