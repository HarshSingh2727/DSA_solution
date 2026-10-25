class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>() ;

        for(int i = 0 ; i < asteroids.length ; i++){

            while(!st.isEmpty() && st.peek() >  0 && asteroids[i] < 0 ){
                int sum = st.peek() + asteroids[i] ;

                if(sum > 0 ){
                    asteroids[i] = 0 ;
                
                }
                else if (sum < 0 ){
                    st.pop() ;
                }
                else{
                    st.pop() ;
                    asteroids[i] = 0 ;
                    break ;
                }
            }

            if(asteroids[i] != 0){
                st.push(asteroids[i]) ;
            }
        } 
    int[] ans = new int[st.size()] ;

    for(int i = ans.length -1 ; i >= 0 ; i--){
        ans[i] = st.pop() ;
    }  

    return ans ;
    }
}