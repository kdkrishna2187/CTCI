/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReturnKthToLast{
    /* brute force approach would be find the length of the list
    and return the (length - k + 1) from the beginning of the list
    
    Iterative solution :Two pointer approach
    TC: O(N) SC: O(1)*/
    public ListNode ReturnKthToLast1(ListNode head , int k){
        ListNode current = head , follower = head;
        for(int index = 0 ; index < k ; ++index){
            current = current.next;
        }
        while(current!=null){
            current = current.next;
            follower = follower.next;
        }
        return follower;
    }
}