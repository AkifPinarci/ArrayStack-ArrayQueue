public class ArrayStack {

    private int size;
    private int[] array;
    public int head = 0;

    /** 
     * Default constructor of the any ArrayStack object at fixed size 10 
     */
    public ArrayStack(){
        this.size = 10;
        array = new int[size];
    }

    /** 
     * Constructor of the any ArrayStack object.
     * @param size decleras the size of the array.
     */
    public ArrayStack(int size){
        this.size = size;
        array = new int[size];
    }

    /** 
    * Resize the array if the head of the stack is reached to the maximum capacity,
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
     * Adds a new entry to the top if this stack.
     * @param newEntry An int to be added to the top of the stack.
     */
    public void push(int newEntry){
        if (this.head == this.size){
            this.reSize();
            this.array[head] = newEntry;
            head++;
        }
        else{
            this.array[head] = newEntry;
            head++;
        }
        
    }

    /**
     * Removes and returns the entry that stays at top of the stack.
     * @return The int at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public int pop(){
        if (head == 0){
            throw new EmptyStackException();
        }
        else{
            head--;
            return this.array[head];
        }
    }

    /**
     * Retrieves this stack's top entry.
     * @return the int at the top of the stacks.
     * @throws EmptyStackException if the stack is empty.
     */
    public int peek(){
        if (this.head == 0){
            throw new EmptyStackException();
        }
        else{
            return this.array[head - 1]; 
        }
    }

    /**
     * Detects whether the stack is empty.
     * @return True if the stack is empty, otherwise false.
     */
    public boolean isEmpty(){
        if (head == 0){
            return true;
        }
        else{
            return false;
        }

    }

    /** 
     * Removes all the entries from the stack
     */
    public void clear(){
        while(!this.isEmpty())
            this.pop();

    }



}
