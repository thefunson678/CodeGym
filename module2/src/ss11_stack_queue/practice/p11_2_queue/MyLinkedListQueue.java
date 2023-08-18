package ss11_stack_queue.practice.p11_2_queue;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail=null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            this.tail = temp;
            this.head = this.tail;
            return;
        }
    }
    public Node dequeue(){
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null){
            this.tail = null;
        }
        return temp;

    }
}
