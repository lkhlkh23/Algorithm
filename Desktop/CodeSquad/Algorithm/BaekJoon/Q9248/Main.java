package Q9248;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        List<String>[] lists = new List[26];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<String>();
        }

        for (int i = 1; i <= input.length(); i++) {
            lists[input.substring(i - 1).charAt(0) - 'a'].add(input.substring(i - 1));
        }

        for (int i = 0; i < lists.length; i++) {
            Collections.sort(lists[i]);
            for(String str : lists[i]) {
                System.out.println(str);
            }
        }
        bw.write(sb.toString());
        bw.close();
    }

    public static int countWord(String str1, String str2) {
        int i = 0;
        while(i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }

    public class Suffix {
        public int index;
        public String words;

        public Suffix(int index, String words) {
            this.index = index;
            this.words = words;
        }
    }
}
