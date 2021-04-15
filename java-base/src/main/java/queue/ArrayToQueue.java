package queue;

/***
 * @deprecated 数组实现队列
 * @author newzhong
 */
public class ArrayToQueue {
    /**
     * 队列
     */
    private int[] array;
    /**
     * 队头
     */
    private int front;
    /**
     * 队尾
     */
    private int rear;

    public ArrayToQueue(int length) {
        this.array = new int[length];
    }

    public void enQueue(int element) throws Throwable {
        int queueLength = array.length;
        if ((rear + 1) % queueLength == front) {
            throw new Throwable("队满");
        }

        array[rear] = element;
        rear = (rear + 1) % queueLength;
    }

}
