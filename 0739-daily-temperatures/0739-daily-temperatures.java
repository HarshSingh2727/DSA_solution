class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length ;
        Stack<Integer> st = new Stack<>() ;
        int[] ans = new int[n] ;

        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int a = st.pop() ;
                ans[a] = i - a ;
            }
            st.push(i) ;
        } 
    return ans ; 
        
    }
}