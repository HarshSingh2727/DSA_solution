class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ;
        int[] posarr = new int[n/2];
        int[] negarr = new int[n/2];

        int p = 0 ;
        int q = 0 ;


        for(int i = 0 ; i<n ; i++){
            
            if(nums[i] > 0 ){
                posarr[p++] = nums[i];
            }
            else if (nums[i] < 0){
                negarr[q++] = nums[i];
            }
        }
        p=0;
        q=0;

        for(int i = 0 ; i < n ; i += 2){
            nums[i] = posarr[p++] ;

        }
        for(int i = 1 ; i < n ; i += 2){
            nums[i] = negarr[q++] ;

        }

        return nums ;
        
    }
}