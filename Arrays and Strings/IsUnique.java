public class IsUnique {

    /* brute force:  O(n^2) ; Taking each character and comparing with other characters
    in the string */
    public static boolean IsUnique1(String str){
        int strlength = str.length();

        for(int i = 0; i< strlength - 1 ; ++i){
            for(int j = i+1; j < strlength;++j){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }

    return true;
    }

    public static void main(String[] args) {
        String a = "aabcde";
        System.out.println(IsUnique1(a));
    }
} 