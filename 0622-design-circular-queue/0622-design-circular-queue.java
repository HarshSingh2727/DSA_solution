class MyCircularQueue {
    int arr[] ;
    int count ;
    int k ;
    int head ;

    public MyCircularQueue(int k) {
        arr = new int[k] ;
        count = 0 ;
        this.k = k ;
        head = 0 ;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false ;
        }
        arr[(head + count) % k] = value ;
        count ++ ;
        return true ;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false ;
        }

        head = (head + 1 ) % k ;
        count -- ;

        return true ;
        
    }
    
    public int Front() {
        if(isEmpty()){
            return -1 ;

        }

        return arr[head];
        
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1 ;
        }

        return arr[(head + count - 1) % k] ;
        
    }
    
    public boolean isEmpty() {
        if(count == 0 ){
            return true ;
        }
        else{
            return false ;
        }
        
    }
    
    public boolean isFull() {
        if(count == k ){
            return true ; 
        }
        else{
            return false ;
        }
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */