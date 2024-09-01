public class K_th_ancestor {
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
    static int K_ancestor(Node root,int node,int k)
    {
        if (root==null) return -1;
        if (root.data==node) return 0;
        int ldist=K_ancestor(root.left,node,k); 
        int rdist=K_ancestor(root.right,node,k); 
        if (ldist==-1 && rdist==-1) return -1;
        int max=Math.max(ldist, rdist);
        if (max+1==k) {
            // return root.data;
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // System.out.println(K_ancestor(root,5,2));
        K_ancestor(root,5,1);
    }
}
