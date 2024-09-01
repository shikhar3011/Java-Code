import java.util.Arrays;

public class arrayreverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reversearr(arr);
        // System.out.println(arr[arr.length/2]);
        System.out.println(Arrays.toString(arr));

    }
    static void reversearr(int[] arr){
        // if (arr.length%2!=0) {
        //     int mid=arr.length/2;
        //     int i=mid-1;
        //     int j=mid+1;
        //     while (i>=0 && j<=arr.length-1) {
        //         swap(arr,i,j);
        //         i--;j++;
        //     }
        // }
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr, i, arr.length-1-i);
        }
        
    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
