class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length ; 
        int n = nums2.length ;

        int[] merge = new int[m + n ] ;

        int k = 0 ;

        for(int num : nums1){
            merge[k++] = num ;
        }

         for(int num : nums2){
            merge[k++] = num ;
        }
     
        Arrays.sort(merge) ;

        
        int len = merge.length  ;
        

       
            

            if((m+n) % 2 == 1){
                return merge[len / 2] ;
            }
            else{
                return (merge[len /2] + merge[(len / 2) - 1]) / 2.0 ;
            }
        
          

             
        
        
    }
    
}