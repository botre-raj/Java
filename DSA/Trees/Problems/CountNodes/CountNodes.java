class CountNodes{
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int index = -1;
    public static Node builtTree(int[] arr){
        index ++;
        if(arr[index] == -1){
             return null;
        }
        Node root = new Node(arr[index]);

        root.left= builtTree(arr);
        root.right = builtTree(arr);
        
        return root;

    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount= countNodes(root.left);
        int rightCount = countNodes(root.right);
        return (leftCount + rightCount + 1);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,
             -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        Node root = builtTree(arr);
 
        System.out.println("Count of Nodes : "+ countNodes(root));
        
    }
}