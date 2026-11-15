import java.util.*;

public class QueueCreation{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
              Node newNode  = new Node(data);
              if(tail == null){
                tail = head = newNode;
                return;
              }
              tail.next = newNode;
              tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int data = head.data;
            head = head.next;
            if(head == null){
                tail = null;
            }
            return data;
        }
         
         public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int data = head.data;
            return data;
         }

    }




    public static void main(String[] args){
         System.out.println("The Queue in Java");
         Queue qu = new Queue();
         qu.add(11);
         qu.add(9);
         qu.add(99);
         while(!qu.isEmpty()){
              System.out.println(qu.peek());
              qu.remove();
         }
    }
}