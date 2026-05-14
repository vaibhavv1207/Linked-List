public class SinglyLinkedListDeletion {
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
                System.out.print("List is empty:");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("Null\n");
        }
        void deleteStart(){
            if (head == null){
                System.out.print("List is empty: ");
                return;
            }
            head = head.next;
        }
        void deleteEnd(){
            if (head == null){
                System.out.print("List is Empty: ");
                return;
            }
            if (head.next == null){
                head = null;
                return;
            }
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        void deleteValue(int position){
            int i = 1;
            if (head == null){
                System.out.print("List is empty: ");
                return;
            }
            if (position < 0 ){
                System.out.print("Not Valid Position: ");
                return;
            }
            if (position == 1 ){
                deleteStart();
                return;
            }
            Node temp = head;
            while (i != position-1 && temp != null){
                temp = temp.next ;
                i++;
            }
            if ( temp == null || temp.next == null ){
                System.out.print("Invalid Position: \n");
                return;
            }
            temp.next = temp.next.next;
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
        list.deleteStart();
        list.printList();
        list.deleteEnd();
        list.printList();
        list.deleteValue(3);
        list.printList();
    }
}
