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
/* efficient approach would be counting the number of characters 
if equal return true
TC: O(n)*/
public static boolean CheckPermutation2(String A , String B){
    if(A.length()!=B.length()){
        return false;
    }
    int [] freq_count = new int[256]; // ASCII characters
    Arrays.fill(freq_count, 0);
    //for each character in the string we increment the count in array
    for(int index = 0; index <A.length(); ++index){
        freq_count[A.charAt(index)]++;
        freq_count[B.charAt(index)]--;
    }
    // if the count is zero return true
    for(int index = 0; index < 256; ++index){
        if(freq_count[index]!= 0){
            return false;
        }
    }
    return true;
}
}