import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Solution so = new Solution();
        String[] included = {"12","123","1235","567","88"};

        System.out.println(so.solution(included));

    }


}

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String phone : phone_book) {
            map.put(phone, 1);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (map.containsKey(phone.substring(0, i))) {
                    return false; // 접두어가 존재하면 false 반환
                }
            }
        }
        return true;
    }
}