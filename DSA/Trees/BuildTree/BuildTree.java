class BuildTree{
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

    static int idx = -1;

    public static Node builtTrees(int[] arrData){
        
        idx ++;
        if(arrData[idx] == -1){
            return null;
        }

        Node root = new Node(arrData[idx]);

        root.left = builtTrees(arrData);
        root.right = builtTrees(arrData);
        return root;

    }
    public static void main(String[] args){
        int[] arr = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        Node root = builtTrees(arr);
        System.out.println("The root value is : " + root.data +" Left of root : "+ root.left.data + " Right of root : "+ root.right.data);
    }
}