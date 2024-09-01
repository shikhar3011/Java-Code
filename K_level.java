import java.util.*;
public class K_level {
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
    public static ArrayList<Integer> k_iterative(Node root,int k){
        
        ArrayList<Integer> ans= new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        // if (k==1) {
        //     ans.add(root.data);
        // }
        int level=1;
        while (!q.isEmpty()) {
            Node curr=q.remove();
            if (curr==null) {
                // System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    level++;
                }
            }
            else{
                if(level==k) ans.add(curr.data);
                if(curr.left!=null){   
                    q.add(curr.left);
                }
                if(curr.right!=null){ 
                    q.add(curr.right);
                }
            }
        }
        // ans.add(level);
        return ans;
    }
    public static void k_level(Node root,int k){
        k_recursive(root, k, 1);
    }
    public static void k_recursive(Node root,int k,int level){
        if(root==null) return;
        if(k==level){
            System.out.print(root.data+" ");
            return;
        }
        k_recursive(root.left, k, level+1);
        k_recursive(root.right, k, level+1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // ArrayList<Integer> ans=k_iterative(root, 3);
        // for (Integer integer : ans) {
        //     System.out.print(integer+" ");
        // }
        // levelorder(root);
        k_level(root, 3);
    }
}
