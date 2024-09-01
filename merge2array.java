import java.util.Arrays;

public class merge2array {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,8};
        int arr2[]={2,4,6,8,10};
        int arr[]=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length||j<arr2.length) {
            if (j==arr2.length||(i<arr1.length && arr1[i]<=arr2[j])) {
                arr[k]=arr1[i];
                i++;k++;
            }
            else{
                arr[k]=arr2[j];
                j++;k++;
            }
        }
        
        return arr;
    }
}
