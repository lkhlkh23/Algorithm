package Q0052_Combination;

public class Combination {
    public static void combination(int index, String originString, String convertedString, int num) {
        if(convertedString.length() == num) {
            System.out.println(convertedString);
        } else {
            for(int i = index; i <= originString.length() - num + convertedString.length(); i++) {
                combination(i + 1, originString, convertedString + originString.charAt(i), num);
            }
        }
    }
}
