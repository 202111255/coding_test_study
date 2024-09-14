import java.util.PriorityQueue;
import java.util.Collections;

public class prioritiyQueue {

    public static void main(String[] args) {
        //코드 실행
    }

    public void priorityQueue() {
        //낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        //높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueueLowest.add(1);
        priorityQueueLowest.add(10);
        priorityQueueLowest.offer(100);

        priorityQueueHighest.add(1);
        priorityQueueHighest.add(10);
        priorityQueueHighest.offer(100);

        // 첫번째 값을 반환하고 제거, 만약 비어있다면 null
        priorityQueueLowest.poll();

        // 첫번째 값 제거, 만약 비어있다면 예외 발생
        priorityQueueLowest.remove();

        // 첫번째 값을 반환만 하고 제거 하지는 않는다.
        // 큐가 비어있다면 null을 반환
        priorityQueueLowest.peek();

        // 첫번째 값을 반환만 하고 제거 하지는 않는다.
        // 큐가 비어있다면 예외 발생
        priorityQueueLowest.element();

        // 초기화
        priorityQueueLowest.clear();
    }
}
