

public class removeNthNode09 {
    static class LinkedList{
        Node head;
        static class Node{
            int data ;
            Node next ;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        void deleteNodeLast(int n ){
            Node slow = head;
            Node fast = head;
            int i = 0 ;
            while ( i < n ){
                fast = fast.next;
                i++;
            }
            if (fast == null){
                head = head.next;
                return;
            }
            while (fast.next != null){
                slow = slow.next ;
                fast = fast.next ;
            }
            slow.next = slow.next.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node n1 = new LinkedList.Node(10);
        LinkedList.Node n2 = new LinkedList.Node(20);
        LinkedList.Node n3 = new LinkedList.Node(30);
        LinkedList.Node n4 = new LinkedList.Node(40);
        LinkedList.Node n5 = new LinkedList.Node(50);

        list.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        list.deleteNodeLast(2);
        list.printList();
    }
}
