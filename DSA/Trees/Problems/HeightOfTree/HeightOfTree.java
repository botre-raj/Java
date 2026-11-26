class HeightOfTree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
             this.data = data;
             this.left = left;
             this.right = right;
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

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftH = heightOfTree(root.left);
        int rightH = heightOfTree(root.right);
        return Integer.max(leftH, rightH)+1;
    }
    public static void main(String[] args){
        int[] arr = {2,4,-1,-1,6,8, -1, -1, 10, -1, -1};
        Node root = builtTree(arr);
        System.out.println("Height of Tree : " + heightOfTree(root));

    }
}