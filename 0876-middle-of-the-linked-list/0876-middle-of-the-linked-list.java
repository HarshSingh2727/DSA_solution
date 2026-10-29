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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head ;
        int count = 0 ;

        while(temp != null){
            temp = temp.next ;
            count++ ;
        }
        if(count == 1 ) return head  ;
        temp = head ;
        int n=1 ;
       while(n !=(count/2)+1){
         n++;
        temp = temp.next ;
       
       }

    return temp ;
    }
}