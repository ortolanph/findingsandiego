package pho.findingsandiego.functional;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;
import pho.findingsandiego.core.loader.Loader;
import pho.findingsandiego.core.report.BurglarConsumer;
import pho.findingsandiego.core.report.BurglarReport;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class FunctionalSearchSandbox {

    private static final String BURGLAR_OCCUPATION = "Burglar";
    private static final String MEXICAN_FOOD = "Mexican";

    public static void main(String[] args) throws IOException, URISyntaxException {
        BurglarConsumer consumer = new BurglarConsumer();
        List<Burglar> burglars = Loader.loadData(args[0]);
        BurglarReport report = new BurglarReport(consumer);

        FunctionalSearch search = new FunctionalSearch(burglars);

        List<Burglar> results1 = search.find(Gender.FEMALE, null, null, null, null);

        report.report(String.format("FUNCTIONAL SEARCH - By Gender: [%s]", Gender.FEMALE), results1);

        List<Burglar> results2 = search.find(Gender.FEMALE, Hair.BROWN, null, null, null);

        report.report(String.format("FUNCTIONAL SEARCH - By Gender and Hair: [%s, %s]", Gender.FEMALE, Hair.BROWN), results2);

        List<Burglar> results3 = search.find(Gender.FEMALE, Hair.BROWN, Eye.BROWN, null, null);

        report.report(String.format("FUNCTIONAL SEARCH - By Gender, Hair and Eye: [%s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN), results3);

        List<Burglar> results4 = search.find(Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, null);

        report.report(String.format("FUNCTIONAL SEARCH - By Gender, Hair, Eye and Occupation: [%s, %s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION), results4);

        List<Burglar> results5 = search.find(Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, MEXICAN_FOOD);

        report.report(String.format("FUNCTIONAL SEARCH - By Gender, Hair, Eye, Occupation and Favorite Food: [%s, %s, %s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, MEXICAN_FOOD), results5);
    }
}
