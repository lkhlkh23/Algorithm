package dataStructure.texteditor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextEditor {

    public class Cursor {
        private int x;
        private int y;

        public Cursor() {

        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void plusX() {
            this.x = this.x + 1;
        }

        public void plusY() {
            this.y = this.y + 1;
        }
    }

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private List<String> list = new ArrayList<>();
    private Cursor cursor = new Cursor();

    public TextEditor() {

    }

    /* 키보드 입력 */
    public void getTextInut() throws IOException {
        list.add(br.readLine());
        cursor.plusY();
    }

    public void getFileInput() {

    }

    /* 파일 읽기 */

    /* 입력 내용 출력 */

    public static void main(String[] args) {
        // vi
    }
}
