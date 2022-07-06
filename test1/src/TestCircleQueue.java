import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author ck
 * @create 2022-06-10  23:51
 */
public class TestCircleQueue {
    @Test
    public void test(){
        CirQueue queue = new CirQueue(3);

        System.out.println("头部元素：" + queue.getQueueEle());
        System.out.println("front: " + queue.getFront() + ", rear: " + queue.getRear());
        showEle(queue);

        queue.enQueue(1);
        System.out.println("头部元素：" + queue.getQueueEle());
        System.out.println("front: " + queue.getFront() + ", rear: " + queue.getRear());
        showEle(queue);

        queue.enQueue(2);
        System.out.println("头部元素：" + queue.getQueueEle());
        System.out.println("front: " + queue.getFront() + ", rear: " + queue.getRear());
        showEle(queue);

        queue.enQueue(3);
        System.out.println("头部元素：" + queue.getQueueEle());
        System.out.println("front: " + queue.getFront() + ", rear: " + queue.getRear());
        showEle(queue);

        queue.enQueue(4);
        System.out.println("头部元素：" + queue.getQueueEle());
        System.out.println("front: " + queue.getFront() + ", rear: " + queue.getRear());
        showEle(queue);

        queue.enQueue(5);
        System.out.println("头部元素：" + queue.getQueueEle());
        System.out.println("front: " + queue.getFront() + ", rear: " + queue.getRear());
        showEle(queue);

        queue.enQueue(6);
        System.out.println("头部元素：" + queue.getQueueEle());
        System.out.println("front: " + queue.getFront() + ", rear: " + queue.getRear());
        showEle(queue);
    }

    public void showEle(CirQueue queue){
        for(int ele : queue.getQueueList()){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("*****************");
    }
}
