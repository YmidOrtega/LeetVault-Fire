package N21_MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ref = new ListNode();
        merge(ref, list1, list2);
        return ref.next;
    }

    private void merge (ListNode current, ListNode list1, ListNode list2){
        if(list1 == null && list2 == null) return;
        if(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ListNode mergeNode = new ListNode(list1.val);
                current.next = mergeNode;
                merge(mergeNode, list1.next, list2);
            }else{
                ListNode mergeNode = new ListNode(list2.val);
                current.next = mergeNode;
                merge(mergeNode, list1, list2.next);
            }
        }else if (list1 != null){
            ListNode mergeNode = new ListNode(list1.val);
            current.next = mergeNode;
            merge(mergeNode, list1.next, list2);
        }else if(list2 != null){
            ListNode mergeNode = new ListNode(list2.val);
            current.next = mergeNode;
            merge(mergeNode, list1, list2.next);
        }
    }
}
