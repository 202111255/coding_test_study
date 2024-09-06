import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class stack_queue {
    public static void main(String[] args) {

    }

    //스택 클래스 사용 방법
    public void basicStack() {
        Stack<Integer> stack = new Stack<>(); //스택 객체 생성
        //스택에 데이터 푸시
        stack.push(1);
        stack.push(2);
        //스택이 비어 있는지 확인
        System.out.println(stack.isEmpty());
        //스택에서 팝
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(6);
        stack.push(5);
        //스택에 가장 최근에 푸시한 값(peek)
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        //스택에 들어 있는 데이터의 개수
        System.out.println(stack.size());
    }

    //문제 1. 올바른 괄호
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')') {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    //큐 클래스 사용 방법
    public void basicQueue() {
        //1. Queue 인터페이스를 활용하는 방법
        //2. 덱 클래스를 활용하는 방법

        //큐를 구현한 ArrayDeque 객체 생성
        Queue<Integer> queue = new ArrayDeque<>();
        //큐에 데이터 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);

        //큐의 맨 앞 데이터를 제거하면서 반환
        int first = queue.poll();
        System.out.println(first); //1

        //덱을 큐 처럼 활용하기 (덱: 양 끝에서 삽입, 삭제 가능)
        ArrayDeque<Integer> queue2 = new ArrayDeque<>();
        queue2.addLast(1);
        queue2.addLast(2);
        queue2.addLast(3);

        //큐의 맨 앞 데이터를 제거하면서 반환
        int first2 = queue2.pollFirst();
    }


    //문제 2. 요세푸스 문제
    private int solution(int N, int K) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            for (int i = 0; i <= K-1; i++) {
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst();
        }
        return deque.pollFirst();
    }


}
