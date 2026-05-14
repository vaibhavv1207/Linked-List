public class SinglyLinkedListInsertion{
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

        void printList(){
            if (head == null){
                System.out.println("List is empty: ");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("Null\n");
        }
        void insertBegin(int data){
            
            Node temp = new Node(data);
            if (head == null){
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }
        void insertEnd(int data){
            Node newNode = new Node(data);
            Node temp = head;
            if (head == null){
                head = newNode;
                return;

            }
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        void insertPosition(int position, int data) {
            // Invalid position
            if(position <= 0){
                System.out.println("Invalid Position");
                return;
            }
            // Position 1 means insert at beginning
            if(position == 1){
                insertBegin(data);    
                return;    
            }
            // Empty list but position is not 1
            if(head == null){
                System.out.println("List is Empty");
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 1;
            // Move temp to previous node of insertion position
            while(i < position - 1 && temp != null){
                temp = temp.next;
                i++;
            }
            // Position out of range
            if(temp == null){
                System.out.println("Invalid Position");
                return;
            }
            // Preserve remaining linked list first
            newNode.next = temp.next;
            // Connect previous node to new node
            temp.next = newNode;
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
        list.printList();
        list.insertBegin(5);
        list.printList();
        list.insertEnd(20);
        list.printList();
        list.insertPosition(1, 7);
        list.printList();
    }
}