package algorithm.linkList;

public class LC2095 {

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head, fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        printList(head);
        return head;
    }


    public static void printList(ListNode one) {
        while (one != null) {
            System.out.println(one.val);
            one = one.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
        deleteMiddle(l1);
    }
}
