class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int n = grid.length ;
        int m = grid[0].length ;

        List<List<Integer>> result = new ArrayList<>() ;

        for( int i =0 ; i < n ; i++){

            result.add(new ArrayList<>()) ;

            for( int j = 0 ; j < m ; j++){
                result.get(i).add(0) ;
            }
        }

        for(int i =0 ; i < n ; i++ ){
            for(  int j = 0 ; j < m ; j++){

                int index = i * m + j ;
                int newindex = (index + k) % (n* m) ;

                int row = newindex / m ;
                int col = newindex % m ;

                result.get(row).set(col , grid[i][j]) ;
            }
        }
        
    return result ;    
    }
}