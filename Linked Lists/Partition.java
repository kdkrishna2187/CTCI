/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Partition{
    /*
    Single pass solution. Create two listsi.e the ones less than x and the other greater than x.
     This method restore the order after partition 
    TC:O(n) SC:O(n) */
    public ListNode partition(ListNode head, int x){
        ListNode dummy1 = new ListNode(0);
        ListNode beforeListStart = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode afterListStart = dummy2;

        while(head!= null){
            if(head.val < x){
                dummy1.next = new ListNode(head.val);
                dummy1 = dummy1.next;
            }
            else{
                dummy2.next = new ListNode(head.val);
                dummy2 = dummy2.next;
            }
            head = head.next;
        }
        //After we reach end of list
        // merging the after and before list
        dummy1.next = afterListStart.next;
        return beforeListStart.next;
    }
}