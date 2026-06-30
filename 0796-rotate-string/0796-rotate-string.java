class Solution {
    public boolean rotateString(String s, String goal) {

        for(int i = 0 ; i < s.length() ; i++){
            String shift = s.substring(i) + s.substring(0 ,i) ;
            if(shift.equals(goal)){
                return true ;
            }  
        }
        return false ;
        
    }
}