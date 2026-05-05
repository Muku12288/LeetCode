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
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode end=null;
        ListNode node=head;
        
        while(node != null){
            arr.add(node.val);
            if(node.next == null){
                //System.out.println(node.val);
                end=node;
                System.out.println(end.val +" "+ end.next);
            }
            node = node.next;
        }
        int len=arr.size();
        //System.out.println(len);

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
        
        //else if(len == k){
        //     return head;
        // }
    return head;
    }
}