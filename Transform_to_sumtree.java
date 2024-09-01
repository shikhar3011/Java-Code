public class Transform_to_sumtree {
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
    public static int transform(Node root){
        if (root==null) return 0;
        int lchild=transform(root.left);
        int rchild=transform(root.right);
        int data=root.data;
        int lsum= root.left==null ? 0: root.left.data;
        int rsum= root.right==null ? 0: root.left.data;
        root.data=lchild+rchild+lsum+rsum;
        return data;
    }
    public static void preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        preorder(root);
        transform(root);
        System.out.println();
        preorder(root);
    }
}
