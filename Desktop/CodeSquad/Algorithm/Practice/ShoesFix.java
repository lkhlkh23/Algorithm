package Practice;

import java.util.Stack;

public class ShoesFix {
    /*
    * 2/3 구두법 고침이
        시간 제한 : 2초메모리 제한 : 256MB
        문제 설명
            가끔 몇몇 작가들은 강조를 하기 위해서 과도하게 느낌표를 남발한다.
            느낌표와 물음표를 섞어서 놀라움을 표시하는 경우도 있다. 예를 들자면 "정말 그렇게 생각해요??!!".
            출판을 하려면 이런 식의 과도한 느낌표와 물음표의 남발을 고쳐야 된다.
            만약 느낌표가 연속으로 여러 개가 사용 되었다면 한 개의 느낌표로 바꾸고, 느낌표와 물음표가 섞여있다면 하나의 물음표로 바꿔야 한다.
            이렇게 고쳐진 문자열을 리턴하시오.

        참고 / 제약 사항
            Document의 길이는 1이상 50이하다.
            Document는 알파벳, 공백, 물음표, 느낌표로만 이루어져있다.
        테스트 케이스
            String document = "This cheese is really great!!!!!" 리턴(정답): "This cheese is really great!"
            String document = "You really like THIS cheese!?!?!?!!!?" 리턴(정답): "You really like THIS cheese?"
            String document = "a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???!" 리턴(정답): "a?a ?a a?b b?C C?D D?EE ? FF! ?"
            String document = " a b c A B ! !!C!!! ! ! !C ?!!? ?!? ??" 리턴(정답): " a b c A B ! !C! ! ! !C ? ? ?"
            String document = " !!?X! ?? This is delicious!!! ??!a!?!" 리턴(정답): " ?X! ? This is delicious! ?a?"
    * */
    public static void main(String[] args) {
        //?가 있으면 ? !가 있으면 !
        //String document = " !!?X! ?? This is delicious!!! ??!a!?!";
        System.out.println(" a b c A B ! !C! ! ! !C ? ? ?".equals(getResult(" a b c A B ! !!C!!! ! ! !C ?!!? ?!? ??"))
                ? "true" : "false");
        System.out.println(" ?X! ? This is delicious! ?a?".equals(getResult(" !!?X! ?? This is delicious!!! ??!a!?!"))
                ? "true" : "false");
        System.out.println("a?a ?a a?b b?C C?D D?EE ? FF! ?".equals(getResult("a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???!"))
                ? "true" : "false");

    }

    public static String getResult(String document) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < document.length(); i++) {
            if(document.charAt(i) == '!' || document.charAt(i) == '?') {
                stack.add(document.charAt(i));
            } else {
                sb.append(stack.contains('?') ? "?" : stack.contains('!') ? "!" : "");
                stack.clear();
                sb.append(document.charAt(i));
            }
        }
        sb.append(stack.contains('?') ? "?" : "!");
        return sb.toString();
    }
}
