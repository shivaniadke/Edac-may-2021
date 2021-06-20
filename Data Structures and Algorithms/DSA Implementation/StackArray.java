package Collections;

public class StackArray {
    int top;
    int arr[];
    int Cap;

    public StackArray(int size){
        top=-1;
        arr=new int[size];
        Cap=size;

    }
    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==Cap-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(0);
        }
        System.out.println(data);
         arr[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        System.err.println(arr[top]);
        return arr[top--];
    }
    public static void main(String[] args) {
    StackArray sa = new StackArray(6);
    System.out.println("Push the data");
    sa.push(10);
    sa.push(20);
    sa.push(30);
    sa.push(40);
    sa.push(50);
    sa.push(60);
    System.out.println("pop the data");
    sa.pop();
    sa.pop();
    sa.pop();
    sa.pop();
    sa.pop();
    sa.pop();
    }

    }    
