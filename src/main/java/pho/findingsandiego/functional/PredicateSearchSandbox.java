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
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateSearchSandbox {

    private static final String BURGLAR_OCCUPATION = "Burglar";
    private static final String MEXICAN_FOOD = "Mexican";

    public static void main(String[] args) throws IOException, URISyntaxException {
        BurglarConsumer consumer = new BurglarConsumer();
        List<Burglar> burglars = Loader.loadData(args[0]);
        BurglarReport report = new BurglarReport(consumer);

        PredicateSearch search = new PredicateSearch(burglars);

        Predicate<Burglar> predicate1 = search.buildSearch(Gender.FEMALE, null, null, null, null);
        List<Burglar> results1 = burglars.stream().filter(predicate1).collect(Collectors.toList());
        report.report(String.format("PREDICATE SEARCH - By Gender: [%s]", Gender.FEMALE), results1);

        Predicate<Burglar> predicate2 = search.buildSearch(Gender.FEMALE, Hair.BROWN, null, null, null);
        List<Burglar> results2 = burglars.stream().filter(predicate2).collect(Collectors.toList());
        report.report(String.format("PREDICATE SEARCH - By Gender and Hair: [%s, %s]", Gender.FEMALE, Hair.BROWN), results2);

        Predicate<Burglar> predicate3 = search.buildSearch(Gender.FEMALE, Hair.BROWN, Eye.BROWN, null, null);
        List<Burglar> results3 = burglars.stream().filter(predicate3).collect(Collectors.toList());
        report.report(String.format("PREDICATE SEARCH - By Gender, Hair and Eye: [%s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN), results3);

        Predicate<Burglar> predicate4 = search.buildSearch(Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, null);
        List<Burglar> results4 = burglars.stream().filter(predicate4).collect(Collectors.toList());
        report.report(String.format("PREDICATE SEARCH - By Gender, Hair, Eye and Occupation: [%s, %s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION), results4);

        Predicate<Burglar> predicate5 = search.buildSearch(Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, MEXICAN_FOOD);
        List<Burglar> results5 = burglars.stream().filter(predicate5).collect(Collectors.toList());
        report.report(String.format("PREDICATE SEARCH - By Gender, Hair, Eye, Occupation and Favorite Food: [%s, %s, %s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, MEXICAN_FOOD), results5);
    }
}
