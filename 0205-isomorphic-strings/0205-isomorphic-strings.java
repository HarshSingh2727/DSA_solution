class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mp1 = new int[256] ;
        int[] mp2 = new int[256] ;
        
        for(int i = 0 ; i < s.length() ; i++ ){

            char ch1 = s.charAt(i) ;
            char ch2 = t.charAt(i) ;

            if(mp1[ch1] != mp2[ch2]){
                return false ;
            }

            mp1[ch1] = i + 1 ;
            mp2[ch2] = i + 1 ;
        }

    return true ;   
    }
}