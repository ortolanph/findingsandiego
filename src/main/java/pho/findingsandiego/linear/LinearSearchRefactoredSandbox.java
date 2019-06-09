package pho.findingsandiego.linear;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.beans.Eye;
import pho.findingsandiego.core.beans.Gender;
import pho.findingsandiego.core.beans.Hair;
import pho.findingsandiego.core.loader.Loader;
import pho.findingsandiego.core.report.BurglarConsumer;
import pho.findingsandiego.core.report.BurglarReport;

import java.util.List;

public class LinearSearchRefactoredSandbox {

    public static final String BURGLAR_OCCUPATION = "Burglar";
    public static final String MEXICAN_FOOD = "Mexican";

    public static void main(String[] args) throws Exception{
        BurglarConsumer consumer = new BurglarConsumer();
        List<Burglar> burglars = Loader.loadData();
        BurglarReport report = new BurglarReport(consumer);

        LinearSearchRefactored search = new LinearSearchRefactored(burglars);

        List<Burglar> results1 = search.find(Gender.FEMALE, null, null, null, null);

        report.report(String.format("By Gender: [%s]", Gender.FEMALE), results1);

        List<Burglar> results2 = search.find(Gender.FEMALE, Hair.BROWN, null, null, null);

        report.report(String.format("By Gender and Hair: [%s, %s]", Gender.FEMALE, Hair.BROWN), results2);

        List<Burglar> results3 = search.find(Gender.FEMALE, Hair.BROWN, Eye.BROWN, null, null);

        report.report(String.format("By Gender, Hair and Eye: [%s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN), results3);

        List<Burglar> results4 = search.find(Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, null);

        report.report(String.format("By Gender, Hair, Eye and Occupation: [%s, %s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION), results4);

        List<Burglar> results5 = search.find(Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, MEXICAN_FOOD);

        report.report(String.format("By Gender, Hair, Eye, Occupation and Favorite Food: [%s, %s, %s, %s, %s]", Gender.FEMALE, Hair.BROWN, Eye.BROWN, BURGLAR_OCCUPATION, MEXICAN_FOOD), results5);
    }
}