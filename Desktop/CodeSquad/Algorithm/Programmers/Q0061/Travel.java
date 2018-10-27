package Q0061;

public class Travel {
    /*
    * Tree : Node(Data), Next(자식정보) * 2 구성
    *  - Tree 자식 노드도 트리이기 때문에 재귀방식으로 풀이 가능
    *
    *  - Tree 탐색 방법
    *    1. PreOrder(전위) : Root -> Left -> Right
    *    2. InOrder(중위) : Left -> Root -> Right --> 정렬된 결과를 알 수 있다!
    *    3. PostOrder(후위) : Left -> Right -> Root --> 후위식으로 인한 연산에 유리
    *
    * Graph : vertex(Data, == Node == 정점), edge(간선 == Link, vertax 와 vertax 연결), node, link
    *    --> 그래프는 배열(첫 정점들의 집합)에 리스트(정점과 간선의 관계)를 붙여넣는 방식으로 사용 가능
    *    --> 이차원배열로 0(연결x), 1(연결O) 로 표현 가능 --> 간선에 가중치가 있을 경우 표현이 좋음! 구현도 좋음!
    *
    *    1. BFS (By Queue)
    *     : visited 테이블 생성 필요 (크기 : Vertax 갯수, 재방문을 막기 위한 목적으로 필요)
    *     : 인접한 Vertax부터 방문
    *     : 간선에 가중치가 없다면, 최단거리 계산 가능
    *
    *    2. DFS (By Stack, 재귀)
    *
    * */

}
