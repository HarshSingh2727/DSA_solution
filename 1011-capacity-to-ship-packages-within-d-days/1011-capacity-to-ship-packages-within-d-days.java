class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int min = 0 ;
        int max = 0 ;

        for( int weight : weights){

            min = Math.max(min , weight) ; 
            max += weight ;
        }


        while(min < max){
            int mid = min + (max - min) / 2 ;

            int day = 1 ;
            int sum = 0 ;

            for(int weight : weights){
                if(sum + weight > mid){
                    day++ ; 
                    sum = 0 ;
                }
                sum += weight ;
            }

            if(day > days){
                min = mid +1 ;
            }
            else{
                max = mid ;
            }


        }

        return max ;
        
    }
}