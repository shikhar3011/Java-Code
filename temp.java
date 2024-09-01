import java.util.Arrays;

public class temp {
    public static int[] SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int n1=arr1.length;
        int n2=arr2.length;
        int[] merge=new int[n1+n2];
        int i=0,j=0;
        for(int k=0;k<merge.length;k++){
            if(arr1[i]<=arr2[j]) {
                merge[k]=arr1[i];
                i++;
            }
            else{
                merge[k]=arr2[j];
                j++;
            }
            k++;
        }
        return merge;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};
        System.out.println(Arrays.toString(SumofMiddleElements(arr1,arr2)));
    }
}
