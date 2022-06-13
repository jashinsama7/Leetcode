class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null || l2 == null)
        {
            return l1;
        }
        
        if(l1 == null)
        {
            return l2;
        }
        
        if(l2 == null)
        {
            return l1;
        }
        
        int carry = 0;
        ListNode temp = null;
        ListNode list = new ListNode(0);
        temp = list;
        
        
        while(l1 != null && l2 != null)
        {
            int x = l1.val + l2.val + carry;
            ListNode node = new ListNode(x%10);
            temp.next = node;
            temp = temp.next;
            carry = x/10;
            l1 = l1.next;
            l2 = l2.next;
        }
         while(l1 != null)
         {
            int x = l1.val + carry;
            ListNode node = new ListNode(x%10);
            temp.next = node;
            temp = temp.next;
            carry = x/10;
            l1 = l1.next;
            
         }
        while(l2 != null)
         {
            int x = l2.val + carry;
            ListNode node = new ListNode(x%10);
            temp.next = node;
            temp = temp.next;
            carry = x/10;
            l2 = l2.next;
         }
        
        
        if(carry != 0)
        {
            ListNode node = new ListNode(carry);
            temp.next = node;
            temp = temp.next;
        }
        return list.next;
    }
}
