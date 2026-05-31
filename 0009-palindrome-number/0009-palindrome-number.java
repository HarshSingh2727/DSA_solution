class Solution {
    public boolean isPalindrome(int x) {
    int rev = 0 ;
    int digit ;
    int original = x ;
    int length = String.valueOf(x).length();
    
    if (x<0) return  false ;

    while(x>0){
        
        digit = x % 10 ;
        rev = rev * 10 + digit ;
        x = x / 10 ;
    }

    return original == rev ;

   
        
    }
}