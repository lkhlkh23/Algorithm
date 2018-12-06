package Q14584;

import java.io.*;
import java.util.*;

public class Main {
    /*
	 	문제 : 암호해독
	 	url : https://www.acmicpc.net/problem/14584
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input = "srbvaffefeczevaluxv".toCharArray();
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                        'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        int[] output = new int[input.length];
        String text = "bake";
        for(int i = 0; i < input.length; i++) {
            if(i == 0) {
                output[i] = 0;
            } else {
                output[i] = ((int)input[i - 1] - (int)input[i]);
            }System.out.print(output[i] + " ");
        }

        bw.close();
    }


}



