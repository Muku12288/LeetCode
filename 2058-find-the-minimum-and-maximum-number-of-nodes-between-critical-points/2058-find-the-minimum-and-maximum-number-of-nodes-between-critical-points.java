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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode node = head;
        int i=0, first=-1, last=-1, mini=Integer.MAX_VALUE,maxi = -1;
        int p=0, c= 0,n=0;

        while(node.next!= null){
            i++;
            c= node.val;
            n = node.next.val;
            if(p!=0 && c!=0 && n!=0){
                if((c>p && c>n && first ==-1) || (c<p && c<n && first ==-1)){
                    first = i;
                    last = i;
                }else if((c<p && c<n) || (c>p && c>n) ){
                    mini = Math.min(mini, i-last);
                    last = i;
                }
            }
            p=c;
            node = node.next;
        }
        if(first == last){
            return new int[]{-1,-1};
        }else{
            maxi = last-first;
        } 

    return new int[]{mini, maxi};
    }
}