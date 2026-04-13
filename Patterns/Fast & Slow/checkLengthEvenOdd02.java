// 🔵 Check if Linked List Length is Even or Odd (Fast Pointer)
// 
// 🧠 Logic:
// - Move fast pointer by 2 steps
// - If fast becomes NULL → length is EVEN
// - If fast stops at last node → length is ODD
//
// 📌 Why it works:
// - Fast skips 2 nodes each time
// - If total nodes are divisible by 2 → lands on NULL
// - If one node is extra → stops at last node
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// ⚠️ Note:
// - Slow pointer is NOT required
// - This is an optimized approach
public class checkLengthEvenOdd02 {
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
        void checkLength(){
            if (head == null){
                System.out.println("List is Empty: ");
                return;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null){
                fast = fast.next.next;
            }
            if (fast == null){
                System.out.println("Even");
                return;
            }
            System.out.println("Odd");
            
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
        list.checkLength();
    }
}
