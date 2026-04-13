// 🔵 Find SECOND Middle of Linked List (Fast & Slow Pointer)
//
// 🧠 Logic:
// - Use two pointers:
//   slow → moves 1 step
//   fast → moves 2 steps
// - Start both from head
// - When fast reaches end → slow is at middle
//
// 📌 Why it works:
// - Fast moves twice as fast as slow
// - When fast finishes traversal,
//   slow has covered half → reaches middle
//
// ⚠️ Important:
// - For EVEN length → returns SECOND middle
//   Example: 10 → 20 → 30 → 40 → returns 30
//
// 🔁 Difference:
// - fast = head → SECOND middle
// - fast = head.next → FIRST middle
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - Always clarify:
//   "Do you want first middle or second middle?"
// - Default approach returns SECOND middle
public class middleLinkedList04 {
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
