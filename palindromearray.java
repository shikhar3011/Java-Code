public class palindromearray {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,1};
        System.out.println(check_palin(arr));
    }
    static boolean check_palin(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i]!=arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
