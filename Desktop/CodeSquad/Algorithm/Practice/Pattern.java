package Practice;

public class Pattern {
    /*3/3 동일 단어
    시간 제한 : 2초메모리 제한 : 256MB
    문제 설명
    두 개의 단어를 한 단어의 글자를 재조합해서 다른 단어를 만들 수 있다면 동일 구조 단어라고 부른다. 글자를 재조합한다는 말은 단어에 등장하는 모든 글자를 다른 글자로 바꾼다는 의미이다. 글자의 순서는 바뀌지 않고 그대로 유지된다. 두 개의 글자가 하나의 글자로 변경될 수는 없지만 글자가 바뀌지 않고 그대로 유지될 수는 있다.
    예를 들어서 "abca"와 "zbxz"는 'a'를 'z'로, 'b'를 'b'로, 'c'를 'x'로 재조합하여 다른 단어로 만들 수 있으므로 동일 구조 단어이다.
    주어진 String[] words에 있는 단어 중 동일 구조 단어쌍이 몇 개인지 반환하여라 (순서는 상관 없다).
    참고 / 제약 사항
    words는 2개 이상, 50개 이사의 요소를 가진다.
    words의 각 요소는 1개 이상, 50개 이하의 소문자이다 ('a'-'z').
    words의 모든 요소는 길이가 같다.
    words내에 중복되는 요소는 없다.
    테스트 케이스
    String[] words = ["abca","zbxz","opqr"] 리턴(정답): 1
            "abca"와 "zbxz"은 동일구조이지만 어느것도 "opqr"와 동일한 구조가 아니다.
    String[] words = ["aa","ab","bb","cc","cd"] 리턴(정답): 4
            4개의 동일 구조 단어쌍이 있다: {"aa", "bb"}, {"aa", "cc"}, {"bb", "cc"}, {"ab", "cd"}.*/

    public static void main(String[] args) {
        String[] words = {"abca", "zbxz", "opqr"};
        //String[] words = {"aa","ab","bb","cc","cd"};
        String[] newWords = new String[words.length];
        for(int i = 0; i < newWords.length; i++) {
            newWords[i] = "";
        }

        for (int i = 0; i < words.length; i++) {
            int cnt = 1;
            for (int j = 0; j < words[i].length(); j++) {
                String subString = words[i].substring(0, j);
                newWords[i] += (subString.contains(words[i].charAt(j) + "") ?
                        newWords[i].charAt(subString.indexOf(words[i].charAt(j) + "")) : cnt++ + " ");
            }
        }

        int result = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i; j <  words.length; j++) {
                if(newWords[i].equals(newWords[j]) && i != j) {
                    System.out.println(newWords[i] + "  " + newWords[j]);
                    result++;
                }
            }
        }

        System.out.println(result);

        //System.out.println("abc".indexOf("a"));
    }
}
