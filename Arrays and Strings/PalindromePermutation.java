import java.util.HashSet;

public class PalindromePermutation{
    /*
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
        return hset.size() <= 1;
    }
    /* Single pass solution: Taking array map with length 128 ASCII characters
    increment the count for odd occurences and decrement for even occurence
    TC:O(n) SC: O(1)  */
    public static boolean PalindromePermutation2(String phrase){
        int [] map = new int[128];
        int phrase_length = phrase.length();
        int count = 0;
        for(int index = 0; index < phrase_length;++index){
            map[phrase.charAt(index)]++;
            if(map[phrase.charAt(index)]%2){
                count --;
            }
            else{
                count++;
            }
        }
        return count <= 1;
    }    
}