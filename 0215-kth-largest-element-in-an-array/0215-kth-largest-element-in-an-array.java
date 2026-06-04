
import java.util.Arrays ;
class Solution {
    
    public int findKthLargest(int[] nums, int k) {
        int i = 0 ;

    Arrays.sort(nums);
    




        for (  i = nums.length - 1  ; i < 0 ; i -- ){

            if (nums[i] == nums[k]){
                return nums[i];
            }
        }
     return nums[i - k + 1] ;  
    }
}