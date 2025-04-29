package Stack;
import java.util.*;

public class Stack1 {
    int stack[];
    int top;
    int size;
    public Stack1(int stackSize){
        
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
        
    }
    public void push(int element){
        if(top >=size-1){
            System.out.println("Stack is full - overflow");
            return ;
        }
        top++;
        stack[top] = element;
    }

    // check if stack is empty or not
    public boolean isEmpty(){
        return top<=-1;
    }

    // check the size of stack 
    public int size(){
        return top+1;
    }

    // return  top value 
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty - underflow");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    //delete top value using pop function
    public int pop(){
        int val = peek();
        if(val!=Integer.MIN_VALUE){
            top--;
        }
        return val;
    }

    // print the Stack
    public void print(){
        for(int i=0; i<=top; i++){
            System.out.print(stack[i]+" ");
            if(i!=top){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int n= sc.nextInt();
        Stack1 myStack = new Stack1(n);
        myStack.push(1);
        myStack.print();
        myStack.push(6);
        myStack.print();
        myStack.push(3);
        myStack.push(6);
        myStack.print();
        System.out.println("Stack size is : "+myStack.size());
        System.out.println("Stack peek element is "+ myStack.peek());
        sc.close();
    }
}
