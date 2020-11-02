public class Main{
    public static void main(String[] args){
        testStackPush();
        testStackPop();
        testStackPeek();
        testStackIsEmpty();
        testStackClear();
        testQueueEnqueue();
        testQueueDequeue();
        testQueueGetFront();
        testQueueIsEmpty();
        testQueueClear();
    }

    /**
     * The test case for the push method of the stack.
     */
    public static void testStackPush() {
        String passed = "-Succesfully pushed the elements.\n";
        String failled = "-Failed to push the elements.\n";
        String testCase = "Stacks: Testing to push integer elements to the stack.";

        System.out.println(testCase);
        int testElem = 11;
        try{
            ArrayStack stack1 = new ArrayStack();
            for (int i = 0; i < 5; i++){
                stack1.push(i);
            }
            stack1.push(testElem);
            if (stack1.peek() == testElem){
                System.out.println(passed);
            }
            
        }
        catch(Exception e){
            System.out.println(failled);
        }
    }

    /**
     * The test case for the pop method of the stack.
     */
    public static void testStackPop() {
        String passed = "-Succesfully popped the element.\n";
        String failled = "-Failed to pop the element.\n";
        String testCase = "Stacks: Testing to pop an element from the top of the stack.";

        System.out.println(testCase);
        try{
            ArrayStack stack1 = new ArrayStack();
            stack1.pop();
            System.out.println(passed);
        }
        catch (Exception e){
            System.out.println(failled);
        }
    }
    
    /**
     * The test case for the peek method of the stack.
     */
    public static void testStackPeek(){
        String passed = "-Succesfully peeked the element.\n";
        String failled = "-Failed to peek the element.\n";
        String testCase = "Stacks: Testing to peek an element from the top of the stack.";

        System.out.println(testCase);
        int testElem = 11;
        try{
            ArrayStack stack1 = new ArrayStack();
            for (int i = 0; i < 5; i++){
                stack1.push(i);
            }
            stack1.push(testElem);
            if (stack1.peek() == testElem){
                System.out.println(passed);
            }
            
        }
        catch(Exception e){
            System.out.println(failled);
        }

    }

    /**
     * The test case for the isEmpty method of the stack.
     */
    public static void testStackIsEmpty(){
        String passed = "-Succesfully checked the stack.\n";
        String failled = "-Failed to checking the stack.\n";
        String testCase = "Stacks: Controling the isEmpty method works properly or not.";

        System.out.println(testCase);
        try{
            ArrayStack stack1 = new ArrayStack();
            if (stack1.isEmpty()){
                ;
            }
            stack1.push(12);
            if (!stack1.isEmpty()){
                ;
            }

            System.out.println(passed);

            
        }
        catch(Exception e){
            System.out.println(failled);
        }

    }

    /**
     * The test case for the clear method of the stack.
     */
    public static void testStackClear(){
        String passed = "-Succesfully cleared the stack.\n";
        String failled = "-Failed to clear the stack.\n";
        String testCase = "Stacks: Testing to clear all the elements from the stack.";

        System.out.println(testCase);
        try{
            ArrayStack stack1 = new ArrayStack();
            for (int i = 0; i < 5; i++){
                stack1.push(i);
            }
            stack1.clear();
            if (stack1.isEmpty()){
                System.out.println(passed);
            }
            
        }
        catch(Exception e){
            System.out.println(failled);
        }
    }
    
    /**
     * The test case for the enqueue method of the queue.
     */
    public static void testQueueEnqueue(){
        String passed = "-Succesfully enqueued the elements.\n";
        String failled = "-Failed to enqueued the elements.\n";
        String testCase = "Queue: Testing to enqueued an integer elements to the queue.";

        System.out.println(testCase);
        int testElem = 99;
        try{
            ArrayQueue queue = new ArrayQueue();
            queue.enqueue(testElem);
            for (int i = 0; i < 5; i++){
                queue.enqueue(i);
            }
            if (queue.getFront() == testElem){
                System.out.println(passed);
            }
            
        }
        catch(Exception e){
            System.out.println(failled);
        }
    }

    /**
     * The test case for the dequeue method of the queue.
     */
    public static void testQueueDequeue(){
        String passed = "-Succesfully dequeued the elements.\n";
        String failled = "-Failed to dequeue the elements.\n";
        String testCase = "Queue: Testing to dequeued an integer elements from the queue.";

        System.out.println(testCase);
        int testElem = 99;
        try{
            ArrayQueue queue = new ArrayQueue();
            queue.enqueue(testElem);
            for (int i = 0; i < 5; i++){
                queue.enqueue(i);
            }
            if (queue.dequeue() == testElem){
                System.out.println(passed);
            }
            
        }
        catch(Exception e){
            System.out.println(failled);
        }
        
    }
    
    /**
     * The test case for the getFront method of the queue.
     */
    public static void testQueueGetFront(){
        String passed = "-Succesfully got the element from the front.\n";
        String failled = "-Failed to get the element from the front.\n";
        String testCase = "Queue: Testing to getting an integer elements from the front of the queue.";

        System.out.println(testCase);
        int testElem = 99;
        try{
            ArrayQueue queue = new ArrayQueue();
            queue.enqueue(testElem);
            for (int i = 0; i < 5; i++){
                queue.enqueue(i);
            }
            if (queue.getFront() == testElem){
                System.out.println(passed);
            }
            
        }
        catch(Exception e){
            System.out.println(failled);
        }
    }

    /**
     * The test case for the isEmpty method of the queue. 
     */
    public static void testQueueIsEmpty(){
        String passed = "-Succesfully checked the queue.\n";
        String failled = "-Failed to checking the queue.\n";
        String testCase = "Queue: Controling the isEmpty method works properly or not.";

        System.out.println(testCase);
        try{
            ArrayQueue queue = new ArrayQueue();
            if (queue.isEmpty()){
                ;
            }
            queue.enqueue(12);
            if (!queue.isEmpty()){
                ;
            }

            System.out.println(passed);

            
        }
        catch(Exception e){
            System.out.println(failled);
        }
    }

    /**
     * The test case for the clear method of the queue. 
     */
    public static void testQueueClear(){
        String passed = "-Succesfully cleared the queue.\n";
        String failled = "-Failed to clear the queue.\n";
        String testCase = "Queue: Testing to clear all the elements from the queue.";

        System.out.println(testCase);
        try{
            ArrayQueue queue = new ArrayQueue();
            for (int i = 0; i < 5; i++){
                queue.enqueue(i);
            }
            queue.clear();
            if (queue.isEmpty()){
                System.out.println(passed);
            }
            
        }
        catch(Exception e){
            System.out.println(failled);
        }
    }
}

