package May25_Stack;

/**
 * Created by senafunakubo on 2017-05-25.
 */

public class Queue {

    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int size = 0;
    int front  = -1;   //index if stack
    int rear = 0;

    public void enQueue(int Element) {
        if (front < capacity - 1) {
            front++;
            arr[front] = Element;
            System.out.println("Element " + Element
                    + " is pushed to Queue !");
            display();
            System.out.println("");
        } else {
            System.out.println("Overflow !");
            System.out.println("");
        }

    }

    public void deQueue() {
        if (front  >= rear) {
            rear++;
            System.out.println("Pop operation done !");
            display();
            System.out.println("");
        } else {
            System.out.println("Underflow !");
            System.out.println("");
        }
    }

    public void display() {
        if (front >= rear) {
            System.out.println("Elements in Queue : ");
            for (int i = rear; i <= front ; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}