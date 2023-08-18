package ss09_arraylist_linkedlist.excercise.ex9_1_arraylist;
import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public void  ensureCapacity(){
        if (size == elements.length){
            int newSize = size*2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }
    public void add(E e){
        ensureCapacity();
        for (int i = 0; i < elements.length;i++){
            if (elements[i]==null){
                elements[i]= e;
            }
        }
    }
    public void add(int index, E e){

    }
}


