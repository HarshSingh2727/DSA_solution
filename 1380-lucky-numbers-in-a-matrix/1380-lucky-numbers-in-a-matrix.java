class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>() ;

        for(int i = 0 ; i < matrix.length ; i++){
            int min = matrix[i][0] ;int col = 0 ;

            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j] ;
                    col = j ;
                }
            }

            boolean luckey = true ;

            for(int k = 0 ; k < matrix.length ; k++){
                if(matrix[k][col] > min){
                    luckey = false ;
                     break ;
                }
            }
            if(luckey){
            result.add(min) ;
            }
        }
        return result ;
    }
}