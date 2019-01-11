package codeforce.gennadycardgame;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] card = br.readLine().toCharArray();
        String[] cards = br.readLine().split(" ");

        String solution = "NO";
        for (int i = 0; i < cards.length; i++) {
            if(card[0] == cards[i].charAt(0) || card[1] == cards[i].charAt(1)) {
                solution = "YES";
                break;
            }
        }
        bw.write(solution);
        bw.close();
    }


}