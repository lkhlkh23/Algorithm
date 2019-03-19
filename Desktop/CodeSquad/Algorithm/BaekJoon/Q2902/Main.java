package Q2902;

import java.io.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stream.of(br.readLine().split("-")).forEach(s -> sb.append(s.charAt(0)));

        bw.write(sb.toString());
        bw.close();
    }
}
