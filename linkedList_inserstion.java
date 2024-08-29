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

public class linkedList_inserstion {


    // INSERSTION AT THE FIRST => HEAD.
    private static Node insertHead(Node head, int val) {

        if (head == null) {
            return new Node(val);
        }
        Node temp = new Node(val, head); //val will be the new head and head is the val.next// }
        return temp;
    }

    //INSERTION AT THE LAST =>  TAIL
    private static Node insertTail(Node head, int val) {

        if (head == null) {
            return new Node(val);
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(val);
        return head;
    }


    //inserting node at kth place, k can never exceed n+1 (n is the length of linked list)

    private static Node insertAtk(Node head, int k, int val) {

        if (head == null) {
            if (k == 1) {
                return new Node(val);
            }
        }
        if (k == 1) {
            Node temp = new Node(val, head);
            return temp;
        }

        int count = 1;
        Node temp = head;

        while (temp != null) {

            count++;

            if (count == k - 1) {

                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;

    }
}
