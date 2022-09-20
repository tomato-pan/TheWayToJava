package fundamental.java_003;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        while (l1.next !=null) {
            System.out.println(l1.val + l2.val);
            System.out.println(l1.val);
            System.out.println(l2.val);
            l1=l1.next;
            l2=l2.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        LC2 lc2 = new LC2();
        ListNode l1 = new ListNode(9);
        ListNode l2= new ListNode(9);
        l1.next= new ListNode(9);
        l1.next.next=new ListNode(9);
        l1.next.next.next=new ListNode(9);
        l1.next.next.next.next=new ListNode(9);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(9);
        l2.next.next.next.next=new ListNode(9);
        lc2.addTwoNumbers(l1,l2);
    }
}
