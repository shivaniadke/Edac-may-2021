import java.util.Scanner;
//////////----------Using Stack--------///////////////

public class Palindrome {
   int top=-1;
   int size;
   string arr[]=new string[size];

void push(string data){
    if(isFull()){
        System.out.println("Cannot Push");
    }
    else{
        top++;
        arr[top]=data;
        
    }
}
void pop(int data){
    if(isEmpty()){
        System.out.println("Push Data");
    }else
    {
        top--;
    }

}

boolean isFull(){
    if(top==size-1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

boolean isEmpty(){
    if(top==-1)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static void main(String[] args) {
    Palindrome obj = new Palindrome();
    Scanner sc = next Scanner(System.in);
    System.out.println("Enter a palindrome....:");
    String sc = sc.Next();
    

}
