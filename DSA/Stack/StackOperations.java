//Stack Operations using Linked List

public class StackOperations{
    static class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
   }
    public static Node head;
    static class Stack{
    public static boolean isEmpty(){
        return head == null;
    }
    public static void push(int data){
        Node newNode = new Node(data);
             if(isEmpty()){
                 head = newNode;
                 return;
             }else{ 
             newNode.next = head;
             head = newNode;             
             } 
    }
    public static int pop(){
         if(isEmpty()){
            return -1;
         }
         int top = head.data;
         head = head.next;
         return top;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    public static void printStack(Stack s){
        if(isEmpty()){
            System.out.println("No Element Present in stack");
            return;
        }
        Node printNode = head;
        while(printNode != null){
            System.out.println(printNode.data);
            printNode = printNode.next;
        }
    }
    }

    public static void main(String[] args){
             System.out.println("Stack : Start");
             
             //creating a stack 
             Stack stack1 = new Stack();

             //inserting data into stack
             stack1.push(1);
             stack1.push(4);
             stack1.push(5);
             stack1.push(9);

             //printing a stack
             stack1.printStack(stack1);

            //pop and peek operations

            while(!stack1.isEmpty()){
                System.out.println(stack1.peek());
                System.out.println(stack1.pop());
            }

            
    }
    
}