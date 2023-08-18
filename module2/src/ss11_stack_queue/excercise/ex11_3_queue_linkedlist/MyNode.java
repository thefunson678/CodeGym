package ss11_stack_queue.excercise.ex11_3_queue_linkedlist;

class MyNode {
    private int data;
    private MyNode link;

    public MyNode(int data, MyNode link) {
        this.data = data;
        this.link = link;
    }

    public MyNode() {

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyNode getLink() {
        return link;
    }

    public void setLink(MyNode link) {
        this.link = link;
    }
}
