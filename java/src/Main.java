import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Solution so = new Solution();
        String[] arr1 = {"X591X","X1X5X","X231X", "1XXX1"};
        //int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(so.solution(arr1));
    }
}

class Solution {
    public int[] solution(String[] maps) {
        int[] answer = {};
        //int[][]형 배열로 만들기
        int[][] new_maps = new int[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) == 'X') {
                    new_maps[i][j] = -1;
                } else {
                    new_maps[i][j] = Integer.parseInt(Character.toString(maps[i].charAt(j)));
                }
            }
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int sum = 0
        for (int i = 0; i < new_maps.length; i++) {
            for (int j = 0; j < new_maps[0].length; j++) {
                if (new_maps[i][j] != -1) {
                    //오른쪽과 아래 확인
                    queue.add(new_maps[i][j]);
                }

            }
        }


        return answer;
    }
}