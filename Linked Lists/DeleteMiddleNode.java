public class DeleteMiddleNode{
    /* if the pointer to the head node is not given 
    only the node to be deleted is given as input
    TC:O(1) SC:O(1) */
    public boolean DeleteMiddleNode1(ListNode middle){
        // ensuring the node to be deleted is not the last node or empty list
        if(middle == null || middle.next== null){
            return false;
        }
        // copying the next node data to middle node and unlinking the next node .
       ListNode adj = middle.next;
       adj.data = middle.data;
       middle.next = adj.next;
       return true;
    }
    /* if the head node is given 
    Two pointer approach : fast and slow pointer.
    when the fast pointer reaches the end of list then slow pointer will be present at the middle node
    TC:O(N) SC:O(1)*/
    public boolean DeleteMiddleNode2(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            
        }
        prev.next = slow.next; 
        return true;
    }
}