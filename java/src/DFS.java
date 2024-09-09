import java.util.ArrayList;

public class DFS {
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
        dfs(start);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    //DFS 탐색 메서드
    private static void dfs(int now) {
        visited[now] = true; //현재 노드를 방문했음을 저장
        answer.add(now); //현재 노드를 결과 리스트에 추가
        //현재 노드와 인접한 노드 순회
        for (int next : adjList[now]) {
            if (!visited[next]) {
                dfs(next);
            }
        }

    }

}
