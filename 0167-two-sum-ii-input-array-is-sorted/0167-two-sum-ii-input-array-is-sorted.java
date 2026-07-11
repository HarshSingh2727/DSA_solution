class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0 ;
        int high = numbers.length - 1 ;

        while(low < high){
            int cursum = numbers[low] + numbers[high] ;

            if(cursum == target){
                return new int[]{low +1 , high + 1} ;

            }
            if(cursum > target ){
                high-- ;
            }
            else{
                low ++ ;
            }
        }

         return new int[]{low + 1 , high +1} ;
        
    }
}