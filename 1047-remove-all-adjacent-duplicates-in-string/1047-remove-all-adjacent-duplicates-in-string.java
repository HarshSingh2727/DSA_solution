class Solution {
    public String removeDuplicates(String s) {

        StringBuilder hs = new StringBuilder() ;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;

            if(hs.length() > 0 && hs.charAt(hs.length() - 1 ) == ch){
                hs.deleteCharAt(hs.length() - 1 ) ;
            }
            else{
                hs.append(ch) ;
            }
        }
    return hs.toString() ;  
    }
}