package algorithm.book_java;

import java.util.*;

/**
 * 스택과 큐 기본
 *
 * 스택은 순차적으로 데이터 추가와 삭제를 하기 때문에 ArrayList로 구현되어있으며,
 * 큐는 데이터를 꺼낼때 첫번째 데이터가 먼저 삭제되므로 빈공간을 처리하는데 ArrayList가 부적합하여(빈공간을 채워주기 위해 배열을 복사해야함) LinkedList를 이용하여 구현되어있다.
 */

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack<>();   // 스택 클래스가 구현되어 있다.
        Queue q = new LinkedList(); // Queues는 인터페이스이며, 이를 구현한 LinkedList를 사용한다.

        // stack에 담는 순서는 0 -> 1 -> 2
        st.push("0");
        st.push("1");
        st.push("2");

        // queue에 담는 순서는 0 -> 1 -> 2
        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack에 있는 데이터를 꺼낸다 =");
        while(!st.empty()){
            System.out.println(st.pop());
            /**
             * stack의 연산들
             * push : 데이터를 맨 위에 쌓는다.
             * pop : 맨 위에있는 데이터를 반환해주고 삭제시킨다.
             * peek : 맨 위에 있는 데이터를 반환해준다. 삭제는 하지 않음
             * search : 주어진 객체를 찾아서 위치를 반환해준다.
             */
        }

        System.out.println("= Queue에 있는 데이터를 꺼낸다 =");
        while(!q.isEmpty()){
            System.out.println(q.poll());
            /**
             * Queue의 연산들
             * offer : Queue에 객체를 저장한다.
             * poll : Queue에서 객체를 꺼내서 반환하고 삭제한다.
             * peek : queue에서 첫번째 요소를 읽어온다. 삭제는 하지 않음
             */
        }
    }
}
