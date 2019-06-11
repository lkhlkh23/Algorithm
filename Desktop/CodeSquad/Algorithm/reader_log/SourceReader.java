package reader_log;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SourceReader {
    public static final String DIRECTORY_PATH = "/Users/lee_ki_hyun/Desktop/Directory";

    private static final String SPLIT_STANDARD = "\"";

    private static final String BLANK = " ";


    public static Map<String, Integer> obtainLogs() throws IOException {
        Map<String, Integer> paths = new HashMap<>();
        for (String url : obtainLogFiles())
            addPaths(paths, url);

        return paths;
    }

    private static List<String> obtainLogFiles() throws IOException {
        List<String> paths = new ArrayList<>();
        Files.list(Paths.get(DIRECTORY_PATH))
                .map(path -> path.getFileName().toString())
                .filter(path -> path.contains("log"))
                .forEach(filePath -> paths.add(DIRECTORY_PATH + File.separator + filePath));
        return paths;
    }

    private static Map<String, Integer> addPaths(Map<String, Integer> paths, String url) throws IOException {
        obtainFileStream(url).forEach(path ->
                paths.put(path, paths.containsKey(path) ? paths.get(path) + 1 : 1));

        return paths;
    }

    private static Stream<String> obtainFileStream(String url) throws IOException {
        return Files.lines(Paths.get(url), Charset.defaultCharset())
                .map(line -> extractPath(line));
    }

    private static String extractPath(String path) {
        return path.split(SPLIT_STANDARD)[1].split(SPLIT_STANDARD)[0].split(BLANK)[1];
    }
}
