package ss11_stack_queue.practice.p11_1_stack_use_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack =new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
}

