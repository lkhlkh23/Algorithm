package reader_log;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SourceWriter.createFile(SourceReader.obtainLogs());
    }
}
