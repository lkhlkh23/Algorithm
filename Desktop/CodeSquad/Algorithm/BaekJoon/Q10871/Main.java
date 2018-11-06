package Q10871;

import java.io.*;

public class Main {
   /*
	 	문제 : X보다 작은수
	 	url : https://www.acmicpc.net/problem/10871
	 	재풀이 : X
	*/
   static final String SPLIT_STANDARD = " ";
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      
      String[] inputs1 = br.readLine().split(SPLIT_STANDARD);
      int n = Integer.parseInt(inputs1[0]);
      int x = Integer.parseInt(inputs1[1]);
      
      String[] inputs2 = br.readLine().split(SPLIT_STANDARD);
      for(int i = 0; i < inputs2.length; i++) {
         if(Integer.parseInt(inputs2[i]) < x) sb.append(inputs2[i] + " ");
      }
      bw.write(sb.toString());
      bw.close();

   }

}