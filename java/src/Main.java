import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Solution so = new Solution();
        int[] included1 = {1, 4, 4, 2};
        int[] included2 = {6, 3, 8, 2};

        System.out.println(so.solution(included1, included2, 59));

    }


}

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int level = Arrays.stream(diffs).min().getAsInt();
        int diff = 0;
        int time_cur = 0;
        long total_time = limit+1;

        while(total_time > limit) {
            total_time = 0;
            int time_prev = 1;
            for (int i = 0; i < diffs.length; i++) {
                diff = diffs[i];
                time_cur = times[i];
                if (level >= diff) {
                    total_time += time_cur;
                } else {
                    total_time += (time_prev+time_cur)*(diff - level) + time_cur;
                }
                time_prev = time_cur;
            }
            level += 1;
            //System.out.println("현재 level: " + level + "시간:" + total_time);
        }
        return (level-1);
    }
}