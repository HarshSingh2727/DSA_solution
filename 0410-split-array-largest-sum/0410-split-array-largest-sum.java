class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0 ; 
        int high = 0 ;

        for(int num : nums){
            low = Math.max(low,num) ;
            high += num ; 
        }

        while(low < high ){

            int mid = low + ( high - low) / 2 ;

            if(cansplit(nums , k , mid)){
                high = mid ;
            }
            else{
                low = mid + 1 ;
            }
        }
       return low ; 
    }

    private boolean cansplit(int[] nums  , int k , int maxsub) {
        int count = 1 ;
        int cousum = 0 ;

        for(int num : nums){
            if(cousum + num <= maxsub){
                cousum += num ;
            }
            else{
                count ++ ;
                cousum = num ;

                if(count > k){
                    return false ;
                }
            }
        }
    return true ;
    }
}