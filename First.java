import java.util.*;

public class First {
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
    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int Nodes[]){
            idx++;
            if(Nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(Nodes[idx]);
            newnode.left=buildTree(Nodes);
            newnode.right=buildTree(Nodes);

            return newnode;
        }
        public void preorder(Node root){
            if (root==null) {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root){
            if (root==null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public void postorder(Node root){
            if (root==null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        
        public void levelorder(Node root){
            if (root==null) {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr=q.remove();
                if (curr==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data+" ");
                    if (curr.left!=null) {
                        q.add(curr.left);
                    }
                    if (curr.right!=null) {
                        q.add(curr.right);
                    }
                }
            }
        }
        public int height(Node root){
            if (root==null) {
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            return Math.max(left, right)+1;
        }
        public int count(Node root){
            if (root==null) {
                return 0;
            }
            int left=count(root.left);
            int right=count(root.right);
            return left+right+1;
        }
        public int sum(Node root){
            if (root==null) {
                return 0;
            }
            int left=sum(root.left);
            int right=sum(root.right);
            return left+right+root.data;

        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        // tree.postorder(root);
        // tree.levelorder(root);
        System.out.println(tree.height(root));
        System.out.println(tree.count(root)); 
        System.out.println(tree.sum(root)); 
    }
}
