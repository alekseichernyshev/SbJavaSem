package week7.Task5;

public class SimpleStack {
    private int[] array;
    private int top = -1;
    private int size;
    public SimpleStack(int size){
        this.size = size;
        this.array = new int[size];
    }

    public void push(int x){
        if (top +1 == size){
            System.out.println("Stack Overflow");
        }else{
            array[++top] = x;
        }
    }
    public int top(){
        if (top==-1){
            System.out.println("Stack underflow");
            return top;
        }else {
            return array[top--];
        }

    }
    public int pop(){
        if (top == -1) {
            System.out.println("Stack underflow");
            return top;
        }else {
            int res = array[top];
           array[top] = 0;
            return res;
        }

    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == size-1);
    }
}
