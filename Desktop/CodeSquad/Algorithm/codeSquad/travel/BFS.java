package codeSquad.travel;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFS {
    /* 인접한 모든 노드들에 접근을 하는 방식
        L0 = {s} , 출발 노드
        L1 = L0과 인접한 노드들의 집합
        L2 = L1과 인접하지만, L0에는 속하지 않는 노드들의 집합
         ... ... ...
    */

    /*
        일반적으로 BFS는 큐를 이용해서 구현을 한다.
    */

    // 1. 출발 노드를 확인한다. (방문 유무를 확인)

    // 2. 출발 노드를 큐에 삽입

    // 3. 큐에서 노드를 꺼내고, 노드와 인접한 큐를 삽입한다. 삽입을 할 때, 이미 방문유무를 확인한다.

    // 4. 큐가 빌때까지 반복을 한다.
}
