package dataStructure.texteditor.view;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class ResultView {
    private static StringBuilder sb = new StringBuilder();
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void printAll(List<String> list) {
        for(int i = 0; i < list.size(); i++) {
            sb.append(stringFormat(i + 1, list.get(i)));
        }
        try {
            bw.write(sb.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String stringFormat(int idx, String str) {
        return String.format("%3d : %s\n", idx, str);
    }

    public static int obtainDigitCount(int num) {
        return (num + "").length();
    }
}
