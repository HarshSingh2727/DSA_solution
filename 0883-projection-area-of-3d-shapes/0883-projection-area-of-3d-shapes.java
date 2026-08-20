class Solution {
    public int projectionArea(int[][] grid) {
        int count = 0 ;
        for(int i = 0 ; i < grid.length ; i ++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] > 0) {
                    count++ ;
                }
            }
        }
        for(int i = 0 ; i < grid.length ; i ++){
            int max = 0 ;
            for(int j = 0 ; j < grid[0].length ; j++){
                max = Math.max(max , grid[i][j]) ;
                }
                    count += max;
                
        }       
        for(int j = 0 ; j < grid.length ; j ++){
            int max = 0 ;
            for(int i = 0 ; i < grid[0].length ; i++){
                max = Math.max(max , grid[i][j]) ;
                }
                    count += max;
                   
            }
        
    return count ; 
    }
}