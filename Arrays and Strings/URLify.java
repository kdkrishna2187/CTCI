public class URLify{
   /*
   Two pass approach. Find the newLength and modify the character array
   TC -> O(n) 
   */
   
    public String URLify1(String s , int trueLength){
        // counting the number of spaces
        int len = s.length();
        char [] str = s.toCharArray();
        int spaces = 0;
        for(int i = 0; i < trueLength ; ++i ){
            if(str[i]=' '){
                spaces++;
            }
        } 
        int newLength = trueLength + 2 * spaces;
        if(trueLength < str.length){
            str[trueLength] = '\0'; // ending the array due to excess spaces
        }
        for(int j = trueLength - 1; j >=0 ; j--){
            if(str[j] = ' '){
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength -3 ;
            }
            else{
                str[newLength - 1] = str[j];
                newLength--;
            }
        }
        return new String(str);
    }
}