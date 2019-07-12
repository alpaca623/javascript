package algorithm.book_java;

/**
 * 직접 Vector 클래스 구현 중
 */

public class Vector {
    /**
     * Object 배열을 이용하여 데이터를 순차적으로 저장한다.
     * 배열에 더이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성하고,
     * 기존의 배열에 저장된 내용을 새로운 배열로 복사한 다음에 저장된다.
     *
     */
    Object[] elementData = null;
    int capacity = 0;
    int size = 0;

    // 초기 사이즈를 받으면 해당 크기만큼의 배열을 선언해준다.
    public Vector(int capacity){
        if(capacity < 0){
            throw new ArrayIndexOutOfBoundsException("잘못된 범위를 선언하였습니다");
        }
        elementData = new Object[capacity];
        this.capacity = capacity;
        size = capacity;
    }

    // 매개변수가 없는 인스턴스 초기화의 경우 10으로 capacity를 초기화해준다.
    public Vector(){
        this(10);
    }

    /**
     * Vector의 용량이 최소한 minCapacity가 되도록 한다.
     * 경우의 수
     * 1. 이미 최소 용량보다 크거나 같은 경우 - 패스
     * 2. 최소 용량보다 작은 경우 - minCapacity 만큼 늘려준다.
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity){
        if(capacity > minCapacity){

        }else{
            Object[] temp = null;
            System.arraycopy(elementData,0,temp,0,minCapacity);

        }

    }

    public void setCapacity(int capacity){
        if(this.capacity == capacity) return;

        Object[] tmp = new Object[capacity];
        System.arraycopy(elementData,0,tmp,0,size);
        elementData = tmp;
        this.capacity = capacity;
    }

    /**
     * 어떠한 데이터도 담을 수 있도록 Object로 매개변수를받고(다형성)
     * 추가가 성공하면 true를 반환해준다.
     *
     * 용량이 꽉 찬 경우, 용량을 늘려주고 추가시킨다.
     * size와 capacity의 차이를 구분하자.
     * @param o
     * @return
     */
    public boolean add(Object o){
        Object[] temp = null;
        if(elementData.length-1 == capacity){
            System.arraycopy(elementData,0, temp, 0,capacity+10);
        }
        temp[elementData.length+1] = o;
        return true;
    }
}
