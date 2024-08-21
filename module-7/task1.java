// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

    
public static Node reverse(Node head) {
    Node curr = head;
    Node next = null;
    Node prev = null;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    head = prev;
    return head;
}

//Total Time Complexity O(n), as the function iterates through the entire linked list exactly once, visiting each node. In each iteration of the while loop, it performs a constant amount of work (reassigning pointers), so the time complexity is proportional to the number of nodes in the list.

//Total Space Complexity O(1), as the function uses a constant amount of extra space, regardless of the size of the input list. Specifically, it uses three pointers (curr, next, and prev) to perform the reversal, and no additional data structures are used. Hence, the space complexity is constant.