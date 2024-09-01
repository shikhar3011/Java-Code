// for unsorted list

import java.util.ArrayList;

public class pairsum2 {
    static boolean checkpairsum(ArrayList<Integer> list,int target){
        int left=0;
        int n=list.size();
        int right=n-1;
        while (left<right) {
            if (list.get(left)+list.get(right)==target) {
                return true;
            }
            if(list.get(left)+list.get(right)<target){
                left=(left+1)%n;
            } else{
                right=(n+right-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=19;
        System.out.println(checkpairsum(list,target));
    }
}
