public class Tree_Diameter {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root)
    {
            if (root==null) {
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            return Math.max(left,right)+1;
        }
    public static int diameter(Node root) //o(n2)
        {
            if (root==null) {
                return 0;
            }
            int ldia=diameter(root.left);
            int lheight=height(root.left);
            int rdia=diameter(root.right);
            int rheight=height(root.right);
            int selfdia=lheight+rheight+1;
            return Math.max(Math.max(ldia,rdia), selfdia);
        }
        public static class Info{
            int diameter;
            int height;
            Info(int diameter,int height){
                this.diameter=diameter;
                this.height=height;
            }
        }
        public static Info diameter2(Node root){ //o(n)
            if (root==null) {
                return new Info(0, 0);
            }
            Info linfo=diameter2(root.left);
            Info rinfo=diameter2(root.right);
            int diameter=Math.max(Math.max(linfo.diameter,rinfo.diameter),linfo.height+rinfo.height+1);
            int height=Math.max(linfo.height,rinfo.height)+1;
            return new Info(diameter, height);
        }
        
    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree=new BinaryTree();
        // Node root=tree.buildTree(nodes);
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter2(root).diameter);
    }
}  

