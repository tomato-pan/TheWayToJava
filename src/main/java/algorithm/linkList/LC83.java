package algorithm.linkList;

public class LC83 {
    public ListNode deleteDuplicates(ListNode head) {
        // 迭代需要找一个当前链表所在位置
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
// a->b->c   h->a