import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFS {
    //인접 리스트를 저장할 ArrayList 배열
    private static ArrayList<Integer>[] adjList;

    //방문 여부를 저장할 boolean 배열
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    private static int[] solution(int[][] graph, int start, int n) {
        //인접 리스트 초기화
        adjList = new ArrayList[n+1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        //그래프를 인접 리스트로 변환
        for (int[] edge : graph) {
            adjList[edge[0]].add(edge[1]);
        }

        //DFS를 순회한 결과를 반환
        visited = new boolean[n+1];
        answer = new ArrayList<>();
        bfs(start);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void bfs(int start) {
        //탐색시 맨 처음 방문할 노드를 add하고 방문처리
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;

        //큐가 비어있지 않은 동안 반복
        while (!queue.isEmpty()) {
            //큐에있는 원소들 중 가장 먼저 추가된 원소를 poll하고 정답리스트에 추가
            int now = queue.poll();
            answer.add(now);
            //인접한 이웃 노드들에 대해서
            for (int next : adjList[now]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }

        }
    }
}
