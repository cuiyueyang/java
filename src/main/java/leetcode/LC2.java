package leetcode;

/**
 * <p>Description: 两数相加</p>
 * <p>@date 2022/6/27 10:49</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        int t = 0;
        while (l1 != null || l2 != null || t != 0) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(t % 10);
            pre = pre.next;
            t /= 10;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        LC2 lc2 = new LC2();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;

        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;

        ListNode a = lc2.addTwoNumbers(listNode1, listNode3);
        System.out.println(a);
    }

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
