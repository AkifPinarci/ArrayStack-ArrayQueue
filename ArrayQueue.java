public class ArrayQueue {

    private int size;
    private int[] array ;
    private int head = 0;
    private int tail = 0;

    /** 
    * Resize the array if the tail of the queue is reached to the maximum capacity,
    * it specificaly double the size.
    */
    private void reSize(){
        int[] copy = (int[]) new int[size * 2];       
        for (int i = 0; i < size; i++) {
            copy[i] = array[i];
        }
        this.size *= 2;
        array = copy;
    }
    /** 
     * Constructor of the any ArrayQueue object.
     * @param size decleras the size of the array.
     */
    public ArrayQueue(int size){
        this.size = size;
        array = new int[size];
    }

    /**
     * Default constructure of the ArrayQueue class, it creater and queue with fixed size 10.
     */
    public ArrayQueue(){
        this.size = 10;
        array = new int[size];
    }

    /**
     * Adds a new entry to the back of this queue.
     * @param newEntry An int to be added to queue.
     */
    public void enqueue(int newEntry){
        if (this.tail == this.size){
            this.reSize();
        }
        this.array[tail] = newEntry;
        tail++;
    }

    /**
     * Removed and returns the entry at the front of the queue.
     * @return The int  at the front.
     * @throws EmptyQueueException if the queue is empty before the operation.
     */
    public int dequeue(){
        if (this.head == this.tail){
            throw new EmptyQueueException();
        }
        else{
            head++;
            return this.array[head - 1];
        }
    }

    /**
     * Retrieves the entry at the front of this queue.
     */
    public int getFront(){
        if (this.head == this.tail){
            throw new EmptyQueueException();
        }
        else{
            return array[head];
        }
    }

    /**
     * Detects whether this queue is empty.
     * @return True if the queue is empty, otherwise false
     */
    public boolean isEmpty(){
        if (this.head == this.tail){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Remoces all the entries from the queue
     */
    public void clear(){
        while(!this.isEmpty())
            this.dequeue();

    }
}

