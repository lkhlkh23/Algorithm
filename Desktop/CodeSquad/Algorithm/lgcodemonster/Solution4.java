package lgcodemonster;

public class Solution4 {
    public static int[] solution(int N, int[][] directory, int[][] query) {
        int[] answer = {};

        int[][] nearArr = new int[N + 1][N + 1];
        for (int i = 1; i < directory.length; i++) {
            nearArr[directory[i][0]][directory[i][1]] = 1;
            nearArr[directory[i][1]][directory[i][0]] = 1;
        }

        for(int i = 0; i < query.length; i++) {
            dijkstra(query[i][0], query[i][1], N, nearArr);
        }

        return answer;
    }

    public static void dijkstra(int v, int des, int max, int[][] maps){
        int distance[] = new int[maps.length];          //최단 거리를 저장할 변수
        boolean[] check = new boolean[maps.length];     //해당 노드를 방문했는지 체크할 변수

        for(int i = 1; i < maps.length; i++)
            distance[i] = Integer.MAX_VALUE;

        distance[v] = 0;
        check[v] = true;

        for(int i = 1; i < maps.length; i++){
            if(!check[i] && maps[v][i] != 0){
                distance[i] = maps[v][i];
            }
        }

        for(int i = 0; i < max - 1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j = 1; j < maps.length; j++){
                if(!check[j] && distance[j] != Integer.MAX_VALUE){
                    if(distance[j] < min ){
                        min = distance[j];
                        minIndex = j;
                    }
                }
            }

            check[minIndex] = true;
            for(int k = 1; k < maps.length; k++){
                if(!check[k] && maps[minIndex][k] != 0){
                    if(distance[k] > distance[minIndex] + maps[minIndex][k]){
                        distance[k] = distance[minIndex] + maps[minIndex][k];
                    }
                }
            }

        }

        for(int i=1; i < maps.length; i++){
            System.out.print(distance[i]+" ");
        }
        System.out.println("");

        System.out.println("destination:" + distance[des]);

    }

    public static void main(String[] args) {
        int[][] directory = {
            {1, 2},
            {1, 3},
            {2, 4},
            {2, 5}
        };
        int[][] query = {
                {1, 5}, {2, 5}, {3, 5}, {4, 5}
        };
        System.out.println(solution(5, directory, query));
    }
}
