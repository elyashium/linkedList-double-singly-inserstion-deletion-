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


public class doublyLinkedList {

    private static Node convertArrtoDLL(int[] arr) {

        if (arr == null || arr.length == 0) {
            return null; // Handle the case where the array is empty or null
        }

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;


    }


    //removing a element from a doubly linked list => HEAD.


    private static Node removehead(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;

        return head;
    }


    // Removing a element from a doubly linked list => TAIL.

    private static Node removeTail(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (head.next. != null) {
            temp = temp.next;
        }

        Node prev = temp.prev;
        prev.next = null;
        temp.prev = null;

        return head;
    }


    //removing kth element from doubly linked list

    private static Node removeKth(Node head, int k) {


        if (head == null) {
            return null;
        }

        //make the temp go to the kth element.

        Node temp = head;
        int count = 1;

        while (temp.next != 0) {
            count++;
            if (count == k) {
                break;
                ;
            }
            temp = temp.next;
        }


        //at the kth posistion, if (temp.next is null) then we're at the tail otherwise if the (temp.prev is null) we're at the head.

        Node back = temp.prev;
        Node front = temp.next;

        // if both are null.

        if (back == null && front == null) {
            return null;
        } else if (back == null) {  //we are at the head.
            //delete head;

            Node prev = head;
            head = head.next;
            head.prev = null;
            prev.next = null;
            return head;


        } else if (front == null) {
            //delete the tail.

            Node prev = temp.prev;
            prev.next = null;
            temp.prev = null;

            return head;


        } else {

            //remove at the kth.

            back.next = front;
            front.prev = back;

            //the block is still pointing to front and back and we have to get rid of it.
            temp.next = null;
            temp.prev = null;

        }


    }


    // removing value(node) from  doubly linked list [the given head wont be the head.]

    void deleteNode(Node temp) {

        Node front = temp.next;
        Node back = temp.prev;

        if (front == null) {
            back.next = null;
            temp.prev = null;

            return head;

        }


    }


    //inserting at the kth position in doubly linked list.


    //inserting before the head


    private static Node beforeHEAD(Node head, int val) {

        Node newNode = new Node(val, head, null);
        head.prev = newNode;

        return newNode;
    }


    //inserting before the TAIL

    private static Node(Node head, int val) {

        if (head.next == null) {

            beforeHEAD(head, val);

        }

        Node tail = head;

        //moving the tail to the last node

        while (tail.next != null) {
            tail = tail.next;
        }

        Node back = tail.prev;
        Node newNode = new Node(val, tail, back);
        back.next = newNode;
        tail.prev = newNode;
    }


    //inserting at the Kth node of the linked list


    void addNode(Node head_ref, int pos, int data) {
        // Your code here

        int p = 0;
        Node temp = head_ref;
        while (p < pos) {
            temp = temp.next;
            p++;
        }

        Node n = new Node(data);
        n.next = temp.next;
        n.prev = temp;
        temp.next = n;


    }
}
