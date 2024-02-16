class MySol {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null) return null;
        
        ListNode temp = head;

        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        if (i == n) return head.next;

        temp = head;
        while (i-- != n+1) {
            temp = temp.next;
        }
        temp.next = n == 1 ? null : temp.next.next;

        return head;
    }
}