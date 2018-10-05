package Hanoi;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {0,1,1,0,1,0,0},
            {0,1,1,0,1,0,1},
            {1,1,1,0,1,0,1},
            {0,0,0,0,1,1,1},
            {0,1,0,0,0,0,0},
            {0,1,1,1,1,1,0},
            {0,1,1,1,0,0,0}
        };

        char[][] arr2 = new char[arr.length][arr[0].length];
        char cnt = 'a';
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][0] == 1) {
                arr2[i][0] = cnt++;
            }
            for(int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] == 1 && arr[i][j - 1] == 0) {
                    arr2[i][j] = cnt++;
                } else if (arr[i][j] == 1 && arr[i][j - 1] == 1) {
                    arr2[i][j] = arr2[i][j - 1];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sb.append(arr2[i][j]);
            }
        }
        String result = sb.toString();
        for (int i = 1; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if(arr2[i - 1][j] != '\u0000' && arr2[i][j] != '\u0000') {
                    for (int k = 0; k < arr2[i].length; k++) {
                        if(arr2[i][k] == arr2[i][j]) {
                            arr2[i][k] = arr2[i - 1][j];
                        }
                    }
                    //result = result.replace(arr2[i][j], arr2[i - 1][j]);
                }
            }
        }
        for(int i = 0; i < 7; i++) {
            System.out.println(result.substring(i * 7, (i + 1) * 7));
        }

        System.out.println("*******");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
