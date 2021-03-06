public class IsUnique {

    /* brute force:  O(n^2) ; Taking each character and comparing with other characters
    in the string */
    public static boolean IsUnique1(String str){
        int strlength = str.length();
        for(int i = 0; i < strlength - 1 ; ++i){
            for(int j = i+1; j < strlength;++j){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
    return true;
    }
    /* Taking a boolean array of size 256( ASCII chaaracters)
    SC:O(1) TC:O(n)
    */
    public static boolean IsUnique2(String str) {
        boolean [] flagarr = new boolean[256];
        int strlength = str.length();
        for(int index = 0; index < strlength; ++index){
            int value = str.charAt(index);
            if(flagarr[value]) {
                return false;
            }
            flagarr[value] = true;
        }
        return true;

    }
} 