package N2130_MaximumTwinSumOfALinkedList;

public class MaximumTwinSumOfALinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int pairSum(ListNode head) {
        int n = 0, ans = 0;
        ListNode current = head;
        while(current != null){
            n++;
            current = current.next;
        }
        n = n/2;
        current = head;
        while(n > 1){
            n--;
            current = current.next;
        }
        ListNode reverse = current.next, currentNode = reverse;
        reverse = reverse.next;
        currentNode.next = null;
        while(reverse != null){
            ListNode nextNode = reverse;
            reverse = reverse.next;
            nextNode.next = currentNode;
            currentNode = nextNode;
        }
        current.next = currentNode;
        current = current.next;
        while(current != null){
            if(head.val + current.val > ans) ans = head.val + current.val;
            head = head.next;
            current = current.next;
        }
        return ans;
    }
}
