// 🔵 Find Length of Cycle in Linked List
//
// 🧠 Logic:
// 1. Detect cycle using slow & fast pointers
// 2. When slow == fast → cycle detected
// 3. Start from meeting point
// 4. Move one pointer step by step
// 5. Count nodes until it reaches same node again
//
// 📌 Why it works:
// - Cycle is a loop
// - Traversing once around loop gives total length
//
// ⚠️ Important:
// - Do NOT move pointer to head
// - Do NOT use two pointers here
// - Only one pointer is enough
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - “Traverse the loop once and count nodes”
public class countLength07 {
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
        int cycleLength(){
            if (head == null){
                return -1;
            }
            int count = 0 ;
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast ){
                    slow = slow.next;
                    count++;
                    while (slow != fast){
                        slow = slow.next;
                        count++;
                    }
                    return count;
                }
            }
            return 0;
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
        System.out.print(list.cycleLength());
    }
}
