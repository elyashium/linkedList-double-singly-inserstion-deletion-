import java.util.Arrays;

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

public class linkedList {

    private static Node convertarr2LL(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return head;


    }


    //reversing linked list => RECURSIVE


        private static Node reverseList(Node head) {

            //recursive

            if(head == null || head.next == null){

                return head; //base case for single or null Node.
            }

            Node newhead = reverseList(head.next);
            Node front = head.next;
            front.next = head;
            head.next = null;

            return newhead;

        }


    //reversing linked list => ITERATIVE

  private static Node reverseList(Node head) {

        //iterative 
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Store next node
            current.next = previous; // Reverse the current node's pointer
            previous = current;    // Move pointers one position ahead
            current = next;
        }

        head = previous; // Previous will be the new head after the loop
        return head;

    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8};
        Node y = new Node(arr[2]);
        System.out.print(y.data);

        Node head = convertarr2LL(arr);


        //trasversal in linked list

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
