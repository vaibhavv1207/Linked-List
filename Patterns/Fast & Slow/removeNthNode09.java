// 🔵 Remove Nth Node from End (One-Pass | Fast & Slow Pointer)
//
// 🧠 Logic:
// 1. Initialize two pointers: slow and fast at head
// 2. Move fast pointer n steps ahead
// 3. If fast becomes NULL → delete head node
// 4. Move both slow and fast one step at a time
// 5. Stop when fast.next == NULL
// 6. slow will be at node BEFORE the target
// 7. Delete node using: slow.next = slow.next.next
//
// 📌 Why it works:
// - Maintains a gap of n nodes between fast and slow
// - When fast reaches end, slow is just before target node
//
// ⚠️ Edge Cases:
// - n == length → delete head
// - n > length → invalid input
// - Single node → result becomes NULL
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - This is the optimal one-pass solution
// - Preferred over two-pass (length-based) approach
//
// 🧠 Key Idea:
// "Maintain a gap of n nodes between two pointers"
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
