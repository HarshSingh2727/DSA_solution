class Solution {

    public static void selectionsort(int[] arr){
        int n = arr.length ;

    for ( int i = 0 ; i <= n - 1 ; i ++){
        int min = i ;
        for( int j = i ; j <= n-1 ; j++){
            if(arr[j] < arr[min]){
                min = j ;
            }
        } 

        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp ;
    }
    }
    public void sortColors(int[] nums) {

    selectionsort(nums);

    for(int i =0 ; i < nums.length ; i ++){
        System.out.print(nums[i] + " ");
    }
        
    }
}