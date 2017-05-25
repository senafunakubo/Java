package May25_Stack;

/**
 * Created by senafunakubo on 2017-05-25.
 */
public class QueueDemo {
        public static void main(String[] args) {
            Queue queueDemo = new Queue();
            queueDemo.enQueue(0);
            queueDemo.enQueue(23);
            queueDemo.enQueue(2);
            queueDemo.enQueue(73);
            queueDemo.enQueue(21);
            queueDemo.deQueue();
            queueDemo.deQueue();
            queueDemo.deQueue();
            queueDemo.deQueue();
        }
}
