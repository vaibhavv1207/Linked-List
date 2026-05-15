public class SearchElement {
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
                System.out.print("List is Empty: ");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("Null\n");
        }
        boolean searchElement(int data){
            if (head == null){
                return false;
            }
            Node temp = head;
            while (temp != null){
                if (temp.data == data){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
        int countLength(){
            if(head == null){
                return 0;
            }
            int i = 0;
            Node temp = head;
            while (temp != null){
                i++;
                temp = temp.next;
            }
            return i ;
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
        boolean result = list.searchElement(30);
        System.out.print(result+"\n");
        System.out.print(list.countLength()+"\n");
    }
}
