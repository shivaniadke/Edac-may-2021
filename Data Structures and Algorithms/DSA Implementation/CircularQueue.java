public class CircularQueue {
    int size;
    int rear=-1;
    int front = 0;
    int cnt;
    int arr[];

CircularQueue(int s){
    size =s;
    rear=-1;
    front=0;
    arr = new int[s];
    cnt=0;
}

void Enqueue(int data){
    if(isFull()){
        System.out.println("Overflow");
    }
    else{
    rear=(rear+1)%size;
    arr[rear]=data;
    cnt ++;
    }

}

void Dequeue(){
    if(isEmpty()){
        System.out.println("Underflow");
    }else
    {
        arr[front++]
    }

}

boolean isFull(){

}

boolean isEmpty(){

}


}
 
