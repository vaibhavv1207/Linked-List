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
            System.out.print("NULL\n");
        }
        String checkLength(){
            if (head == null){
                return "Even";
            }
            Node fast = head;
            while (fast != null && fast.next != null){
                fast = fast.next.next;
            }
            if (fast == null){
                return "Even";
            }
            return "Odd";
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
        list.printList();
        System.out.print("Length of LinkedList is: "+list.checkLength());
    }
}
