class Solution {
    public int strStr(String haystack, String needle) {
        
        for( int j = 0 ; j<= haystack.length() - needle.length() ; j++){

            int i = 0 ;

            while(i < needle.length() && haystack.charAt(j+ i) == needle.charAt(i)){
                {
                    i++ ;
                }
            }
            if( i == needle.length()){
                return j ;
            }
        }
    return -1 ;   
    }
}