public class Stack {
    int top=-1;
    int size=5;
    int arr[]=new int[size];

void push(int data)
{
    if(isFull()){
        System.out.println("Stack is overflow");
    }
    else{
        top++;
        arr[top]=data;
    }
}

void pop()
{
    if(isEmpty()){
    System.out.println("Stck is underflow");
}
        else{
        --top;
    }
}

boolean isFull()
{
    if(size-1==top)
    {
    return true;
    }
    else{
    return false; 
    }
}

boolean isEmpty()
{
    if(top==-1)
    {
        return true;
    }
    return false;
}
void peek()
{
    System.out.println(arr[top]);
}
public static void main(String[] args) {
    Stack obj = new Stack();
    obj.push(10);
    obj.push(20);
    obj.push(30);
    obj.push(50);
    obj.push(60);
    obj.push(70);
    obj.pop();
    obj.peek();
    obj.pop();
    obj.pop();
    obj.pop();
    obj.pop();
}

public void Enqueue(int i) {
}

public void Dequeue() {
}
}