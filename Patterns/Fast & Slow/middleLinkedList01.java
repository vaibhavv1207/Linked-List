// 🔵 Find Middle of Linked List (Fast & Slow Pointer)
//
// 🧠 Logic:
// - Use two pointers:
//   slow → moves 1 step
//   fast → moves 2 steps
// - When fast reaches end → slow will be at middle
//
// 📌 Why it works:
// - Fast travels double speed of slow
// - When fast finishes the list,
//   slow has covered half → reaches middle
//
// ⚠️ Important:
// - If list length is EVEN → this returns SECOND middle
//   Example: 10 → 20 → 30 → 40 → returns 30
//
// 🔁 To get FIRST middle (even case):
// - Start fast from head.next instead of head
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - Always clarify:
//   "Do you want first middle or second middle?"
// - Default approach returns SECOND middle
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
        int middleElement(){
            if(head == null){
                return -1;

            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
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
        System.out.print("Middle element is: "+list.middleElement());
    }
}
