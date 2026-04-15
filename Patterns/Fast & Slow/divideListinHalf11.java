// 🔵 Split Linked List into Two Halves
//
// 🧠 Logic:
// 1. Use slow & fast pointers to find middle
// 2. Store second half head (slow.next)
// 3. Break list using slow.next = null
// 4. Return second list
//
// 📌 Result:
// - head → first half
// - secondHead → second half
//
// ⚠️ Important:
// - Always store secondHead BEFORE breaking
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - Used in merge sort, palindrome, reorder list
public class divideListinHalf11 {

    static class LinkedList {
        Node head;

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // 🔵 Split list into two halves
        LinkedList splitList() {
            if (head == null || head.next == null) {
                return null;
            }

            Node slow = head;
            Node fast = head;

            // Find middle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Split
            Node secondHead = slow.next;
            slow.next = null;

            // Create second list
            LinkedList secondList = new LinkedList();
            secondList.head = secondHead;

            return secondList;
        }

        // Print list
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
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

        // Split the list
        LinkedList secondList = list.splitList();

        // Print both lists
        System.out.print("First Half: ");
        list.printList();

        System.out.print("Second Half: ");
        if (secondList != null) {
            secondList.printList();
        }
    }
}