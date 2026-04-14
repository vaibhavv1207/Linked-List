// 🔵 Find Starting Node of Cycle (Floyd’s Algorithm)
//
// 🧠 Logic:
// 1. First detect cycle using slow & fast pointers
// 2. When slow == fast → cycle detected
// 3. Move one pointer to head
// 4. Keep other pointer at meeting point
// 5. Move both one step at a time
// 6. Where they meet again → start of cycle
//
// 📌 Why it works:
// - Let distance from head → cycle start = A
// - Let distance from cycle start → meeting point = B
// - Let remaining cycle distance = C
//
// - At meeting:
//   slow distance = A + B
//   fast distance = A + B + C + B
//
// - Since fast = 2 × slow:
//   A + B = C + B
//   ⇒ A = C
//
// 👉 So:
// - Distance(head → start) = Distance(meeting → start)
//
// 👉 That’s why both pointers meet at cycle start
//
// ⚠️ Important:
// - This step works ONLY after cycle is detected
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - This is the second phase of Floyd’s Algorithm
// - Always explain "A = C" concept for strong impression
public class meetingPoint06 {
    static class LinkedList{
        Node head;
        static class Node{
            int data;
            Node next;
            Node (int data){
                this.data = data;
                this.next = null;
            }
        }
        int meetingPoint(){
            if (head == null){
                return -1;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    slow = head;
                    while (slow != fast){
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow.data;
                }
            }
            return -1;
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
        n4.next = n2;
        System.out.print(list.meetingPoint());
    }
}
