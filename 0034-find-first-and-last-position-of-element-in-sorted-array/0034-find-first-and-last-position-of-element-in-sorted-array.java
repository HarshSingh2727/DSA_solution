class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length ; 
        int low = 0 ; 
        int high = n - 1 ;
        int index = -1;
        int ind = -1 ;
        int[] temp = new int [2];

         while (low <= high){
            int mid = (low+ high)/2 ;
            if(nums[mid] > target){
                high = mid -1 ;
            }
            else if (nums[mid] < target ){
                low = mid + 1 ;
            }
            else{
                index = mid ;
                high = mid - 1;
                  
            }
        }

        low = 0;
        high = n-1 ;


         while (low <= high){
            int mid = (low+ high)/2 ;
            if(nums[mid] > target){
                high = mid -1 ;
            }
            else if (nums[mid] < target ){
                low = mid + 1 ;
            }
            else{
                ind = mid ;
                low = mid + 1 ;
               
            }
        }
       temp[0] = index ;
       temp[1] = ind;

       return temp ; 
    }
}