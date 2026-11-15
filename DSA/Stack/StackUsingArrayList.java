import java.util.*;
public class StackUsingArrayList{
    static class Stack{
        static ArrayList<Integer> s = new ArrayList<>();
        public static boolean isEmpty(){
            return s.size() == 0;
        }
        public static void push(int data){
              s.add(data);
        }
        public static int pop(){
              if(isEmpty()){
                return -1;
              }
              int top = s.get(s.size() -1);
              s.remove(s.size()-1);
              return top;
        }
        public static int peek(){
             if(isEmpty()){
                return -1;
             }
             return s.get(s.size()-1);
        }
    }
    public static void main(String[] args){
        Stack st =new Stack();
        st.push(3);
        st.push(33);
        st.push(333);

        while(!st.isEmpty()){
            System.out.println("The Top Element is : "+ st.peek());
            st.pop();
        }
        
    }
}