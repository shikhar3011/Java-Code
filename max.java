import java.util.ArrayList;

public class max {
    static int maximum(ArrayList <Integer> list){
        int max=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(maximum(list));
    }
}
