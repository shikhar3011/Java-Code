public class Min_Distance {
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
    static Node lca2(Node root,int node1,int node2){
        if(root==null || root.data==node1 || root.data==node2) return root;
        Node leftside=lca2(root.left,node1,node2);
        Node rightside=lca2(root.right,node1,node2);
        if (leftside==null) return rightside;
        if (rightside==null) return leftside;
        // if (leftside!=null && rightside!=null) return root;
        return root;
    }
    public static int dist(Node root,int node){
        if (root==null) return -1;
        if (root.data==node) return 0;
        int ldist=dist(root.left, node);
        int rdist=dist(root.right, node);
        if (ldist==-1 && rdist==-1) return -1;
        else if (ldist==-1) return rdist+1;
        else  return ldist+1;
    }
    public static int min_dist(Node root,int n1,int n2){
        Node lca_=lca2(root,n1,n2);
        int dist1=dist(lca_,n1);
        int dist2=dist(lca_,n2);
        return dist1+dist2;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        System.out.println(min_dist(root,4,5
        ));
    }
}
