class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] arr = new int[nums.length] ;
        int x = 0 ;
        int y = nums.length - 1 ;

        for(int i = 0 ; i < nums.length ; i ++) {
            if(nums[i] % 2 == 0){
                arr[x] = nums[i] ;
                x++ ;
            }
            else{
                arr[y] = nums[i] ;
                y-- ;
            }
        }
    return arr ;   
    }
}