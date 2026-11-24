class PreOrder{
    //Tree Node
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
    public static Node buildTrees(int[] arr){
        index ++;
          if(arr[index] == -1){
            return null;
          }
          Node root= new Node(arr[index]);
          root.left = buildTrees(arr);
          root.right = buildTrees(arr);
          return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String[] args){
        int[] arr = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        Node root = buildTrees(arr);
        preOrder(root);
    }
}