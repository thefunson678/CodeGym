package ss11_stack_queue.excercise.ex11_3_queue_linkedlist;

public class MyQueue {
    private MyNode front;
    private MyNode rear;

    public MyNode getFront() {
        return front;
    }

    public void setFront(MyNode front) {
        this.front = front;
    }

    public MyNode getRear() {
        return rear;
    }

    public void setRear(MyNode rear) {
        this.rear = rear;
    }

    public MyQueue(MyNode front, MyNode rear) {
        this.front = front;
        this.rear = rear;
    }
    public MyQueue() {
        this.front = null;
        this.rear = null;
    }
}
