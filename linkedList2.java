class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {       //constructor used to intialize sef defined datatype that is class node
        this.data = data1;
        this.next = next1;

    }

    Node(int data1) {                  //constructor used to intialize sef defined datatype that is class node
        this.data = data1;
        this.next = null;

    }

};

public class linkedList2 {

    //removing a element from a linked list => HEAD.
    private static Node removehead(Node head) {

        if (head == null) {
            return head;
        }
        head = head.next;   // we dont have to use free() or delete() to free the memory in java because of garbage collector in java.
        return head;

    }


    // Removing a element from a linked list => TAIL.

    private static Node removeTail(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (head.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }


    //removing kth element from linked list

    private static Node removeK(Node head, int k) {

        if (head == null) {
            return head;
        }

        if (k == 1) {
            Node temp = head;
            head = temp.next; //optional
            return head;
        }

        //for the kth element

        int count = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {

            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


    // removing value(node) from linked list
    private static Node removeK(Node head, int val) {

        if (head == null) {
            return head;
        }

        if (head.data == val) {
            Node temp = head;
            head = temp.next; //optional
            return head;
        }

        //for the kth element

        Node temp = head;
        Node prev = null;

        while (temp != null) {

            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
