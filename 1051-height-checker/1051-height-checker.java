class Solution {
    public int heightChecker(int[] heights) {
        int count = 0 ;

        int[] freq = new int[101] ;
        for(int i = 0 ; i < heights.length ; i++){
            freq[heights[i]] ++ ;
        }
         int index = 0 ;
        for(int i = 0 ; i < freq.length ; i++ ){

            

            while(freq[i] > 0){
                if(heights[index] != i){
                    count++ ;
                }
                index++ ;
                freq[i] -- ;

            }
        }


    return count ;    
    }
}