
public class OneAway{
    /* Simple brute force approach.
    TC:O(n) SC:O(1) 
    */
    public boolean OneAway1(String A,String B){
        int Alen = A.length();
        int Blen = B.length();
        // different cases
        if(Math.abs(Alen-Blen) > 1){
            return false;
        }
        if(Alen == Blen){
            return OneReplace(A,B);
        }
        if(Alen + 1 == Blen){
            return OneEdit(A,B);
        }
        return OneEdit(B,A);
    }
    public boolean OneReplace(String word1, String word2){
        int edit_count = 0;
        for(int index = 0;index < word1.length();index++){
            if(word1.charAt(index)!= word2.charAt(index)){
                edit_count++;
            }
        }
        return edit_count==1;
    }
    public boolean OneEdit(String word1 , String word2){
        int index1 = 0;
        int index2 = 0;
        while(index1 < word1.length() && index2 < word2.length()){
            if(word1.charAt(index1)!=word2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }
}