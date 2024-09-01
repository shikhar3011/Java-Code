import java.util.*;
public class container_with_most_water {
    // static int max_water(ArrayList<Integer> list){
    //     int max=0;
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i+1; j < list.size(); j++) {
    //             int height=Math.min(list.get(i), list.get(j));
    //             int width=j-i;
    //             max=Math.max(max, height*width);
    //         }
    //     }
    //     return max;
    // }
    static int max_water(ArrayList<Integer> list){
        int left=0;
        int right=list.size()-1;
        int max=0;
        while(left<right){
            int height=Math.min(list.get(left), list.get(right));
            int width=right-left;
            int curr=height*width;
            max=Math.max(max, curr);
            if (list.get(left)<list.get(right)) {
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(max_water(list));
    }
}
