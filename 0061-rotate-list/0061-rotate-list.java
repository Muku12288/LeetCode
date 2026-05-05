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
        // ArrayList<Integer> arr = new ArrayList<>();
        int len =0;
        ListNode end=null;
        ListNode node=head;
        
        while(node != null){
            // arr.add(node.val);
            len++;
            if(node.next == null){
                end=node;
            }
            node = node.next;
        }
        // int len=arr.size();
        

        if(len<=1){
            return head;
        }
        else if(len<k || len>k){
            if(len<k)k=k%len;
            int n=Math.abs(len-k);
            end.next = head;
            ListNode itr =head;
            for(int i=0; i<n; i++){
                
                if(i==n-1){
                    head =itr.next;
                    itr.next =null;
                }
                itr = itr.next;
            }

        }
    
    return head;
    }
}