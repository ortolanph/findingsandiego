package pho.findingsandiego.core.loader;

import pho.findingsandiego.core.beans.Burglar;
import pho.findingsandiego.core.converter.BurglarConverter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Loader {

    private static final String RESOURCE_NAME = "carmensandiego.csv";

    public static List<Burglar> loadData() throws URISyntaxException, IOException {
        BurglarConverter converter = new BurglarConverter();

        return Files
                .lines(Path.of(ClassLoader.getSystemResource(RESOURCE_NAME).toURI()))
                .map(converter)
                .collect(Collectors.toList());
    }
}
