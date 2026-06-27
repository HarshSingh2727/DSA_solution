class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length ;
        int  col = mat[0].length ;

        return func(  mat , row , col) ;
        
    }
    private int[] func(int[][]mat , int n , int m ){
        int low = 0 ;
        int high = m - 1 ;

        while(low <= high){

            int mid = low + ( high - low) / 2;

            int maxrow = 0 ;

            for(int i = 0 ; i < n ; i++){
                if(mat[i][mid] > mat[maxrow][mid]){
                    maxrow = i ;
                }
            }

            int left = (mid > 0) ? mat[maxrow][mid -1] : -1 ;
            int right = (mid < m -1 ) ? mat[maxrow][mid + 1] : -1  ;

            if(mat[maxrow][mid] > left && mat[maxrow][mid] > right){
                return new int[]{maxrow , mid};
            }
            if(left > mat[maxrow][mid]){
                high = mid - 1 ;
            }
            else{
                low = mid + 1 ;
            }

            
           
        }
         return new int[]{-1 ,-1 } ;
    } 
}