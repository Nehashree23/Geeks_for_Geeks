class myStack {
    private int[] arr;
    private int length;
    private int top;
    public myStack(int n) {
        // Define Data Structures
     length=n;
        arr=new int[length];
        top=-1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top==-1;
    }

    public boolean isFull() {
        // check if the stack is full
        return length-1==top;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(top==length-1){
          
             return;
        }
        arr[++top]=x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(top==-1){
         
             return;
        }
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
         if(top==-1){
     
             return -1;
        }
        return arr[top];
    }
}