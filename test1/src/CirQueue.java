import org.junit.jupiter.api.Test;

/**
 * @author ck
 * @create 2022-06-10  15:17
 */
public class CirQueue {
    private int size;
    private int front;
    private int rear;
    private int addTimes;

    private int[] queueList;
    public CirQueue(){}
    public CirQueue(int size){
        this.size = size;
        front = 0;
        rear = 0;
        addTimes = 0;
        queueList = new int[size];
    }

    public int getQueueEle(){  //获取头元素
        int element = -1;
        if(!isEmpty()){
            element = queueList[front];
            return element;
        }else {
            System.out.println("队列为空");
            return -1;
        }
    }

    public int deQueue(){  //出队
        int element = -1;
        if(!isEmpty()){
            element = queueList[front];
            front = (front + 1) % size;
            return element;
        }else {
            System.out.println("队列为空");
            return -1;
        }
    }

    public void enQueue(int element){  //入队
        if(!isFull()){
            queueList[rear] = element;
            addTimes++;
            rear = (rear + 1) % size;

        }else {
            System.out.println("队列已满");
//            front = (front == size - 1) ? 0 : front + 1;
//            rear = front - 1;
//            rear = (rear == size) ? 0 : rear + 1;
            front = (front + 1) % size;
            rear = (rear + 1) % size;
        }
    }

    public boolean isEmpty(){
        boolean b = false;
        if(rear == front){
            b = true;
        }
        return b;
    }

    public boolean isFull(){
        boolean b = false;
        if((rear + 1) % size == front){
            b = true;
        }
        return b;
//        return addTimes == 3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int[] getQueueList() {
        return queueList;
    }

    public void setQueueList(int[] queueList) {
        this.queueList = queueList;
    }


}






