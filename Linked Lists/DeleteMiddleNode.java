public class DeleteMiddleNode{
    /* if the pointer to the head node is not given 
    only the node to be deleted is given as input
    TC:O(1) SC:O(1) */
    public boolean DeleteMiddleNode1(ListNode middle){
        // ensuring the node to be deleted is not the last node or empty list
        if(middle == null || middle.next== null){
            return false;
        }
        // copying the next node data to temp node and unlinking .
        ListNode adj = middle.next;
        middle.data = adj.data;
        middle.next = adj.next;
        return true;
    }
}