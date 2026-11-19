
class Solution {
    public ListNode partition(ListNode head, int x) {

            if(head == null || head.next == null){
                return head ;
            }

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);

        ListNode bsmall = small;
        ListNode clarge = large;

        ListNode temp = head;

        while(temp != null) {

            if(temp.val < x) {
                bsmall.next = temp;
                bsmall = temp;
            }
            else {
                clarge.next = temp;
                clarge = temp;
            }

            temp = temp.next;
        }

        clarge.next = null;

        bsmall.next= large.next;

        return small.next;
    }
};
