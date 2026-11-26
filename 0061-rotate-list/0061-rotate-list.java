/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0){
            return head ;
        }

       
        ListNode temp = head ;
        int size = 1 ;
       

        while(temp.next != null){
            size ++ ;
            temp = temp.next ;
            
        }

         if(k == 0 ){
                return head ;
            }

        temp.next = head ;
  

        k = k % size ;

        int steps = size - k  ;

        

        ListNode prev = temp ;

        while(steps > 0){
            prev = prev.next ;
            steps-- ;
        }
        ListNode newnode = prev.next ;
        prev.next = null ;

        

        return newnode ;
    }
}