// class Node {
//     int val;
//     Node next;

//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }
    
public static Node merge(Node head1, Node head2) {
    if (head1 == null) return head2;
    if (head2 == null) return head1;

    Node merged;

    // Initialize the merged linked list with the smaller head
    if (head1.val <= head2.val) {
        merged = head1;
        head1 = head1.next;
    } else {
        merged = head2;
        head2 = head2.next;
    }

    Node currMerged = merged;

    while (head1 != null && head2 != null) {
        if (head1.val <= head2.val) {
            currMerged.next = head1;
            head1 = head1.next;
        } else {
            currMerged.next = head2;
            head2 = head2.next;
        }
        currMerged = currMerged.next;
    }

    // Attach the remaining part of the list (if any)
    if (head1 != null) {
        currMerged.next = head1;
    } else {
        currMerged.next = head2;
    }

    return merged;
}

//The time complexity of the merge function is O(n + m), where n is the number of nodes in the first linked list (head1), and m is the number of nodes in the second linked list (head2). The function iterates through both linked lists simultaneously, comparing the values of the current nodes. In the worst case, it will visit each node in both linked lists exactly once. The while loop handles the merging, and the final check adds any remaining nodes from one of the lists to the merged list, but this still results in a linear time complexity relative to the total number of nodes.
    
// The space complexity of the merge function is O(1).The function performs the merging in-place, reusing the existing nodes from the input linked lists rather than creating new ones. Therefore, it requires a constant amount of additional space, regardless of the size of the input lists. Only a few pointers are used for traversal and linking, so the space complexity is constant.
