class Node {
    int data;
    Node next;
    Node prev;


    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
};


public class reversingDLL {

    // the swap with stack memory (which is LIOF => last input output first) trasverses the linked list two times
    // and gives 2n complexity, it can be considered a brute force approach but for optimal solution, we need not swap
    // but to reverse the links of the linked list. i.e change the next and prev of the nodes.

    private static Node reverse(Node head) {

        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, return the head as is
        }

        Node last = null;
        Node current = head;

        while (current != null) {

            last = current.prev; // Save the previous node
            current.prev = current.next; // Swap the prev and next pointers
            current.next = last;

            current = current.prev; // Move to the next node in the original list (which is current.prev now)
        }

        // After the loop, last is at the old head's previous, which is null.
        // current is now null, so last is the last valid node, and the new head is its previous (now its next).
        return last.prev;
    }

}
