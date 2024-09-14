import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Solution so = new Solution();
        int[] arr1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(so.solution(arr1, arr2));
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        for (int[] command : commands) {
            int[] slicedArray = Arrays.copyOfRange(array, command[0]-1, command[1]);
            slicedArray = Arrays.stream(slicedArray).sorted().toArray();
            answer[i] = slicedArray[command[2]-1];
            i++;
        }

        return answer;
    }
}