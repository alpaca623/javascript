package algorithm.book_java;

import java.util.*;

public class MyStack extends Vector {

    /**
     * stack에 데이터를 추가한다.
     * vector클래스의 addElement를 그대로 이용한다.
     * @param item
     * @return
     */
    public Object push(Object item){
        addElement(item);
        return item;
    }

    /**
     * pop 연산
     * 스택의 맨 위에 있는 데이터를 꺼냄과 동시에 삭제한다.
     * @return
     */
    public Object pop(){
        Object obj = peek();
        // 내가 생각했던 삭제 방법인데 멋있게도 Vector클래스와 비슷하다.(Vector클래스에는 index에 elementCount가 들어가있음)
//        elementData[elementData.length-1] = null;
        removeElementAt(size()-1);
        return obj;
    }

    /**
     * peek 연산
     * 스택의 맨 위에 있는 있는 데이터를 반환해준다.
     * @return
     */
    public Object peek(){
        // 마지막으로 들어간 데이터이므로 index는 배열의 마지막 요소일 것이다.
        int length = size();
        // 만약 스택이 비어 있다면 예외를 발생시킨다.
        if(length == 0){
            throw new EmptyStackException();
        }
        // 마지막 요소를 반환해준다.
        return elementAt(length-1);
    }

    /**
     * empty 연산
     * 스택이 비어있는지 확인한다.
     * @return
     */
    public boolean empty(){
        return size() == 0;
    }

    /**
     * 스택에 찾고자 하는 요소가 있는지 확인하여 저장된 위치(index)를 반환해준다.
     * @param o
     * @return
     */
    public int search(Object o){
        // 배열의 마지막 요소부터 거꾸로 찾아야 한다.(스택의 특성)
        int i = lastIndexOf(o);
        if(i >= 0){ //요소를 찾은 경우
            return size() - i;  // 스택의 특성상 ArrayList의 마지막 요소부터 쌓이는 것이므로 마지막 요소에서 찾은 인덱스를 빼주면 해당 데이터의 위치를 찾을 수 있다.
        }
        return -1;
    }
}
