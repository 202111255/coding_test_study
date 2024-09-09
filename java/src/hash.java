import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ABC", 10);
        hashMap.put("BBB", 20);
        hashMap.put("AAA", 30);
        hashMap.put("ABC", 15);

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.get("ABC"));
        System.out.println(hashMap.containsKey("ABC"));

        hashMap.remove("ABC");
        System.out.println(hashMap.size());

        hashMap.clear();
        System.out.println(hashMap.isEmpty());

    }

    public void hash() {
        /*
        * put(key값, value값) - 해시맵에 데이터를 저장
        get(key값) - key값에 대한 value값을 반환
        remove(key값) - 해시맵에서 key에 해당하는 데이터 삭제
        containsKey(key값) - 해시맵 안에 해당 key가 있다면 true, 없으면 false
        clear() - 해시맵 안의 모든 데이터를 삭제
        isEmpty() - 해시맵 안에 데이터가 없다면 true, 있다면 false를 반환
        size() - 해시맵 안에 있는 데이터의 개수를 반환
        * */
    }
}
