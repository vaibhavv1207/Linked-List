// 🔵 Detect Cycle in Linked List (Floyd’s Algorithm)
//
// 🧠 Logic:
// - Use two pointers:
//   slow → moves 1 step
//   fast → moves 2 steps
// - If cycle exists → fast will meet slow
// - If fast reaches NULL → no cycle
//
// 📌 Why it works:
// - Fast moves faster than slow
// - In a cycle, fast will eventually "catch" slow
//
// ⚠️ Key Condition:
// - slow == fast → cycle exists
// - fast == null → no cycle
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - This is called Floyd’s Cycle Detection Algorithm
// - Always preferred over HashSet (better space)
public class detectCycles05 {
    static class LinkedList{
        Node head;
        static class Node{
            int data ;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        boolean checkCycle(){
            if (head == null){
                return false;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    return true;
                }
            }
            return false;
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
        System.out.print(list.checkCycle());
    }
}
