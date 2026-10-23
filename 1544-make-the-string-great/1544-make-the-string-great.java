class Solution {
    public String makeGood(String s) {

        Stack<Character> st = new Stack<>() ;
        StringBuilder chara = new StringBuilder() ;

        for(int i = 0 ; i < s.length() ; i++){
            if(!st.isEmpty() && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(st.peek()) && s.charAt(i) != st.peek()){
                st.pop() ;

            }
            else{
                st.push(s.charAt(i)) ;
            }
        }
    
        while(!st.isEmpty()){
            chara.append(st.pop()) ;
        }
    

    return chara.reverse().toString() ;  
    }
}