public class palindrome {
    public static void main(String[] args) {
        // int x=121;
    int x=-121;
    String str=String.valueOf(x);
    // System.out.println(str);
    char chr1[]=new char[str.length()];
    for (int i = 0; i < chr1.length; i++) {
        chr1[i]=str.charAt(i);
    }
    char chr2[]=new char[str.length()];
    for (int j = chr2.length-1; j >= 0; j--) {
        chr2[j]=str.charAt(j);
    }
    
    for (int i = 0; i < chr1.length; i++) {
        
    }
    }

}
