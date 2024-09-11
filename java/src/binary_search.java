import java.util.Arrays;

public class binary_search {
    //프로그래머스 [PCCP 기출문제] 2번 / 퍼즐 게임 챌린지
    //아래 nonBinary 코드로 풀었더니 계속해서 시간초과가 뜸
    //이진탐색방법으로 코드를 바꿨더니 시간초과 해결
}
class nonBinary {
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

class binary {
    public int solution(int[] diffs, int[] times, long limit) {
        int minLevel = Arrays.stream(diffs).min().getAsInt();
        int maxLevel = Arrays.stream(diffs).max().getAsInt();
        int level = minLevel;

        while (minLevel <= maxLevel) {
            int midLevel = (minLevel + maxLevel) / 2;
            long total_time = calculateTotalTime(diffs, times, midLevel);

            if (total_time > limit) {
                minLevel = midLevel + 1;
            } else {
                level = midLevel;
                maxLevel = midLevel - 1;
            }
        }

        return level;
    }

    private long calculateTotalTime(int[] diffs, int[] times, int level) {
        long total_time = 0;
        int time_prev = 1;

        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int time_cur = times[i];
            if (level >= diff) {
                total_time += time_cur;
            } else {
                total_time += (time_prev + time_cur) * (diff - level) + time_cur;
            }
            time_prev = time_cur;
        }

        return total_time;
    }
}
