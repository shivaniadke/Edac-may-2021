public class Queue {
    
        int size=5;
        int arr[]= new int[size];
        int front=0;
        int rear=0;
        void Enqueue(int data){
            if(isFull()){
                System.out.println("Queue Overflow");
            }
            else{
                arr[rear]=data;
                rear++;
            }
        }
        void Dequeue(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
            }
            else{
                front ++;
            }
        }
        void peek(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
            }
            else{
            System.out.println("The front element is : " +arr[front]);
            }
        }
        boolean isFull(){
            if(rear==size-1){
                return true;
            }
            else{
                return false;
            }
        }
        boolean isEmpty(){
            if (rear == front){
                rear = 0;
                front = 0;
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String[] args) {
            Queue obj = new Queue();
            obj.Enqueue(11);System.out.println("1");
            obj.Enqueue(12);System.out.println("2");
            obj.Enqueue(13);System.out.println("3");
            obj.Enqueue(14);System.out.println("4");
            obj.Enqueue(15);System.out.println("5");
            obj.peek();System.out.println("6");
            obj.Dequeue();System.out.println("7");
            obj.peek();System.out.println("8");
            obj.Enqueue(50);System.out.println("9");
            obj.Dequeue();
            obj.Enqueue(65);
            obj.peek();System.out.println("10");
            obj.Dequeue();System.out.println("11");
            obj.Dequeue();System.out.println("12");
            obj.Dequeue();System.out.println("13");
            obj.peek();System.out.println("14");
            obj.Dequeue();System.out.println("15");
            obj.Dequeue();System.out.println("16");
            obj.Dequeue();System.out.println("17");
            obj.Dequeue();System.out.println("18");
            obj.Dequeue();System.out.println("19");
            obj.Enqueue(60);System.out.println("20");
            obj.peek();System.out.println("21");
        }
    }