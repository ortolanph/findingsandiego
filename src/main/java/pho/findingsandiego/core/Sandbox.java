package pho.findingsandiego.core;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.loader.Loader;
import pho.findingsandiego.core.report.BurglarConsumer;
import pho.findingsandiego.core.report.BurglarReport;

import java.util.List;

public class Sandbox {

    public static void main(String[] args) throws Exception {
        BurglarConsumer consumer = new BurglarConsumer();
        List<Burglar> burglars = Loader.loadData(args[0]);
        BurglarReport report = new BurglarReport(consumer);

        report.report("ALL DATA", burglars);
    }
}
