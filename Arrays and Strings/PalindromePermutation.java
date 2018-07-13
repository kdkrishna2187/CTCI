import java.util.HashSet;

public class PalindromePermutation{
    /* Using hashSet. We add the character if it's present in the set else remove it
    if the size is less than or equal to 1 return true.
    TC:O(n) SC:O(n)
    */
    public static boolean PalindromePermutation1(String phrase){
        HashSet<Character> hset = new HashSet<Character>();
        int phrase_length = phrase.length();
        for(int index = 0 ; index < phrase_length; index++){
            char letter = phrase.charAt(index);
            if(hset.contains(letter)){
                hset.remove(letter);
            }
            else{
                hset.add(letter);
            }
        }
        
        if(hset.size()<=1){
            return true;
        }
        else{
            return false;
        }
    }
}