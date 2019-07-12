package algorithm.book_java;
import java.util.*;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);

        System.out.println("== 접근시간 테스트 ==");
        System.out.println("ArrayList : " +access(al));
        System.out.println("LinkedList : " +access(ll));


        /**
         * 결과로 알 수 있는 것
         * List는 데이터가 연속적으로 저장되어 있으므로,
         * 배열의 경우 시작점을 알면 단순 수식계산으로 찾고자 하는 데이터의 위치를 알 수 있다.
         * 하지만 LinkedList의 경우, 불연속적인(다음 노드의 주소를 저장하고 있음) 데이터의 연결이기때문에 순차적으로 찾아갈수밖에 없다.
         * 
         * 하여 LinkedList는 접근시간이 ArrayList보다 길어진다는 단점이 존재함
         * 
         */
    }

    static void add(List list){
        for(int i = 0; i<100000; i++) list.add(i+"");
    }

    static long access(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
