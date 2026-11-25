import java.util.*;
class LevelOrder{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int index = -1;
    public static Node builtTree(int[] arr){
        index ++;
        if(arr[index]==-1){
            return null;
        } 
        Node root = new Node(arr[index]);
        root.left = builtTree(arr);
        root.right = builtTree(arr);
        return root;
    }

    public static void levelOrder(Node root){

         if(root == null){
            return;
         }

         Queue<Node> q = new LinkedList<>();

         q.add(root);

         while(!q.isEmpty()){

            Node curr = q.remove();

            System.out.println("Front of Queue: "+ curr.data);

            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
         }
    }

    public static void main(String[] args){
        int[] arr = {1, 11, -1, -1, 3, 12, -1, -1, 5, -1, -1};
        Node root = builtTree(arr);
        levelOrder(root);
    }
}