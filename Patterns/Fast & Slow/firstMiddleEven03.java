// 🔵 Find FIRST Middle of Linked List (Even Length)
//
// 🧠 Logic:
// - Use slow and fast pointers
// - slow moves 1 step
// - fast moves 2 steps
// - Start fast from head.next
//
// 📌 Why it works:
// - Starting fast ahead makes slow stop one step earlier
// - This ensures FIRST middle in even length
//
// ⚠️ Important:
// - Example: 10 → 20 → 30 → 40 → returns 20 (first middle)
//
// 🔁 Difference:
// - fast = head → second middle
// - fast = head.next → first middle
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - Always clarify:
//   “Do you want first or second middle?”
// - Default solution gives SECOND middle unless modified
public class firstMiddleEven03 {
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
            Node fast = head.next;
            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.data);
            
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
