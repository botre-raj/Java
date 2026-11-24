class InOrder{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
              this.data = data;
              this.left = null;
              this.right =null;
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
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(" "+ root.data);
        inOrder(root.right);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        Node root = builtTree(arr);
        inOrder(root);

    }
}