// 🔵 Find Nth Node from End (One-Pass | Fast & Slow Pointer)
//
// 🧠 Logic:
// 1. Initialize slow and fast pointers at head
// 2. Move fast pointer n steps ahead
// 3. Move both pointers together until fast reaches NULL
// 4. slow will be at Nth node from end
//
// 📌 Why it works:
// - Maintains a gap of n nodes between fast and slow
// - When fast reaches end, slow reaches target
//
// ⚠️ Edge Cases:
// - n <= 0 → invalid
// - n > length → invalid
// - n == length → return head
//
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
//
// 🎯 Interview Tip:
// - Same logic as removing Nth node
// - Just return node instead of deleting
public class nthNodeEnd10 {
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
        int nthNode(int n ){
            if (head == null || n <= 0){
                return -1;
            }
            Node slow = head;
            Node fast = head; 
            int i = 0;
            while (i < n){
                if (fast == null) return -1; // n > length
                fast = fast.next;    
                i++;    
            }    
            while (fast != null){    
                slow = slow.next;    
                fast = fast.next;    
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
        System.out.println("The Node value is: "+list.nthNode(0));
    }
}
