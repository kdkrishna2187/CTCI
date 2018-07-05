import java.util.HashSet;

public class RemoveDups{
    /* using buffer --> Hashset
    TC--> O(n) SC--> O(n) 
    */
    public static void RemoveDups1(ListNode head){
        HashSet<Integer> hSet = new HashSet<Integer>(); // Assuming the list contains integer elements
        ListNode current = head;
        ListNode previous = null;
        while(current!= null){
            if(hSet.contains(current.data)){
                previous.next = current.next;
            }
            else{
                hSet.add(current.data);
                previous = current;
            }
            current = current.next;
        }

    }
}