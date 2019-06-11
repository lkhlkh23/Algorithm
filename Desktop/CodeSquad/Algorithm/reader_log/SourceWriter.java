package reader_log;

import java.io.*;
import java.util.Map;

public class SourceWriter {

    private static final String FILE_NAME = "result.txt";

    public static void createFile(Map<String, Integer> paths) {
        File file = new File(SourceReader.DIRECTORY_PATH + File.separator + FILE_NAME);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            for (String path : paths.keySet()) {
                bw.write(path + "\r\n");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
