public class TreeCreation{

    public static void main(String[] args){
       System.out.println("Creation of Tree");
       Node a = new Node(100);
       Node b = new Node(20);
       a.left=b;
       System.out.println(a.data+" "+ a.left+" "+a.right);
       System.out.println(b.data+" "+b.left+" "+b.right);
    }
}


    class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
