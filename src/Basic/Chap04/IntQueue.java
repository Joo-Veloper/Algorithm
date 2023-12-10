package Basic.Chap04;

public class IntQueue {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){ }
    }
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        }catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
    public int enque(int x) throws IntStack.OverflowIntStackExceptino{
        if(num >= capacity)
            throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == capacity)
            rear = 0;
        return x;
    }

}
