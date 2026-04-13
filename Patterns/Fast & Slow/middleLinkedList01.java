public class middleLinkedList01 {
    static class LinkedList{
        Node head;
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        // Print Linked List
        void printList(){
            if(head == null){
                System.out.println("List is Empty: ");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        int middleElement(){
            if (head == null){
                System.out.print("List is Empty: ");
                return -1;
            }
            // Find middle node (returns SECOND middle for even length)
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }   
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        LinkedList.Node n1 = new LinkedList.Node(10);
        LinkedList.Node n2 = new LinkedList.Node(20);
        LinkedList.Node n3 = new LinkedList.Node(30);
        LinkedList.Node n4 = new LinkedList.Node(40);
        // Creating linked list: 10 -> 20 -> 30 -> 40
        list.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        list.printList();
        System.out.println("Middle Element is: "+list.middleElement());
    }
}
