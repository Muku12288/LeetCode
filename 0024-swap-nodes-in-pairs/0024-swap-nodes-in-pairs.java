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
    public ListNode swapPairs(ListNode head) {
         ListNode dummyNode = new ListNode(0, head);
        ListNode prevNode =dummyNode;
        ListNode currNode= head;
       

        // if(head == null|| head.next!= null)return head;

        while(currNode != null && currNode.next != null){
            ListNode npn = currNode.next.next;
            ListNode second = currNode.next;            

            prevNode.next = second;
            currNode.next = npn;
            second.next = currNode;
            
            prevNode = currNode;
            currNode= npn;
            
        }
        return dummyNode.next;
    }
}