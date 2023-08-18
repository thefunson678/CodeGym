package ss11_stack_queue.excercise.ex11_3_queue_linkedlist;

import ss11_stack_queue.practice.p11_2_queue.Node;

import java.util.Scanner;

public class MySolution  {
    MyQueue myQueue = new MyQueue();
    public void enQueue(){
        MyNode newMyNode = new MyNode();
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Node data: ");
        newMyNode.setData(Integer.parseInt(scanner.nextLine()));
        if (myQueue.getRear() == null){
            myQueue.setFront(newMyNode);
        } else {
            myQueue.getRear().setLink(newMyNode);
        }
        myQueue.setRear(newMyNode);
        myQueue.getRear().setLink(myQueue.getFront());
    }
    public void deQueue(){
        if (myQueue.getFront().equals(myQueue.getRear())){
            myQueue.setFront(null);
            myQueue.setRear(null);
        } else {
            myQueue.setFront(myQueue.getFront().getLink());
            myQueue.getRear().setLink(myQueue.getFront());
        }
    }
    public void displayQueue(){
        if (myQueue.getFront() != null) {
            MyNode tmp = myQueue.getFront();

            do {
                System.out.println(tmp.getData());
                tmp = tmp.getLink();
            } while (tmp != myQueue.getFront());
        }
    }
}
