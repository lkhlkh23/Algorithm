package Q2490;
import java.io.*;

public class Main {
   static final int LOOP = 3;
   static final String SPLIT_STANDARD = " ";
   static final char[] GAME_RESULT = {'D', 'C', 'B', 'A', 'E'};
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      
      for(int i = 0; i < LOOP; i++) {
         String[] input = splitInput(br.readLine());
         sb.append(getResult(input) + "\n");
      }
      
      bw.write(sb.toString());
      bw.close();
   }
   
   public static String[] splitInput(String str) {
      return str.split(SPLIT_STANDARD);
   }
   
   public static char getResult(String[] arr) {
      int cnt = 0;
      for(int i = 0; i < arr.length; i++) {
         cnt = arr[i].equals("1") ? cnt + 1 : cnt;
      }
      
      return GAME_RESULT[cnt];
   }

}