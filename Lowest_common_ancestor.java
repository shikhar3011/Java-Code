import java.util.ArrayList;

public class Lowest_common_ancestor {
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
    static boolean getPath(Node root,int node,ArrayList<Node> path){
        if (root==null) {
            return false;
        }
        path.add(root);
        if(root.data==node){
            return true;
        }
        Boolean foundleft=getPath(root.left, node, path);
        Boolean foundright=getPath(root.right, node, path);
        if (foundleft || foundright) {
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca(Node root,int node1,int node2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getPath(root,node1,path1);
        getPath(root,node2,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)) break;
        }
        Node lca=path1.get(i-1);
        return lca;
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
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        Node ancestor=lca2(root, 4,6);
        System.out.println(ancestor.data);
    }
}
