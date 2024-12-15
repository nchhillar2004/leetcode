class ListNode {
    int val; // data value of the node
    ListNode next; // reference to the next node in the list (or null if it is the last node)
    ListNode() {} // Default constructor
    ListNode(int val) { this.val = val; } // Creates a node with a value
    ListNode(int val, ListNode next) { this.val = val; this.next = next; } // Creates a node with a value and links it to the next node.
}

// Ex. To make a List Node l1 = [1, 2, 4]
// ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)))
// 1 -> 2 -> 4

