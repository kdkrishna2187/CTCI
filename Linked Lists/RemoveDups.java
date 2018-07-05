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
    /****Follow-up: without using buffer 
     Two pointer approach.
     TC--> O(n^2) SC->O(1)
    */
    public static void RemoveDups2(ListNode head){
        ListNode first = head;
        while(first !=null){
            ListNode current = first ;
            while(current.next != null){
                if(current.next.data == first.data){
                    current.next = current.next.next;
                }
                else{
                    current = current.next;
                }   
            }
            first = first.next;
        } 
    }
}