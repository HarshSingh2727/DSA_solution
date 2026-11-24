class MinStack {
    Stack <Integer > st  ;
    Stack <Integer > minstack ;

    public MinStack() {
       st = new Stack<>() ;
       minstack = new Stack<>() ;
    }
    
    public void push(int value) {
        st.push(value) ;

        if(minstack.isEmpty() || minstack.peek() >= value ){
            minstack.push(value) ;
        }
        
    }
    
    public void pop() {
        int pop = st.pop() ;

        if(pop == minstack.peek()){
            minstack.pop() ;
        }
        
    }
    
    public int top() {
       return  st.peek() ;
        
    }
    
    public int getMin() {
      return   minstack.peek() ;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */