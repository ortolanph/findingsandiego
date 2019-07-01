package pho.findingsandiego.core;

import java.io.File;
import java.io.FileFilter;

public class CSVFileFilter implements FileFilter {

    private static final String CSV_EXTENSION = "csv";

    @Override
    public boolean accept(File file) {
        return file.getName().toLowerCase().endsWith(CSV_EXTENSION);
    }

    public static void main(String[] args) {
        String CSV_EXTENSION = "csv";
        File dir = new File("/home/user/");
        File[] csvFiles = dir.listFiles(f -> f.getName().toLowerCase().endsWith(CSV_EXTENSION));

        Thread t = new Thread(() -> {});
    }

}
