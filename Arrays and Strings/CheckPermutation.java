import java.util.Arrays;

public class CheckPermutation{
/* Sort the arrays and compare the characters. If equal return true else false
TC: O(nlogn)  */
public static boolean CheckPermutation1(String A , String B){
    if(A.length()!=B.length()){
        return false;
    }
    char[] a = A.toCharArray();
    char[] b = B.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    
    //comparing both the arrays using in built "equals" function
    return Arrays.equals(a, b);

}

}