public class removeLoop08 {

    static class LinkedList {
        Node head;

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        void removeLoop() {
            if (head == null) return;

            Node slow = head;
            Node fast = head;

            // Step 1: Detect cycle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {

                    // Step 2: Move slow to head
                    slow = head;

                    // Case 1: Cycle starts at head
                    if (slow == fast) {
                        while (fast.next != slow) {
                            fast = fast.next;
                        }
                        fast.next = null;
                        return;
                    }

                    // Case 2: Cycle starts somewhere else
                    while (slow.next != fast.next) {
                        slow = slow.next;
                        fast = fast.next;
                    }

                    // Break loop
                    fast.next = null;
                    return;
                }
            }
        }

        // Print Linked List
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node n1 = new LinkedList.Node(10);
        LinkedList.Node n2 = new LinkedList.Node(20);
        LinkedList.Node n3 = new LinkedList.Node(30);
        LinkedList.Node n4 = new LinkedList.Node(40);

        list.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // loop

        list.removeLoop();
        list.printList();
    }
}