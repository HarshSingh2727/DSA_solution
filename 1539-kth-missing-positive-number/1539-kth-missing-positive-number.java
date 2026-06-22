class Solution {
    public int findKthPositive(int[] arr, int k) {

      
        int i =  0 ;

        for(int num : arr){
            if(num <= k){
                k++ ;
            }
           
            
        }
        return k ;
        
    }
}