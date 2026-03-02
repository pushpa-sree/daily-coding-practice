import java.util.*; 
//day03
// Middle of the Linked List
//https://leetcode.com/problems/middle-of-the-linked-list/description/
 class Node{
    int data ; 
    Node next; 
    Node(int data){
          this.data = data; 
          this.next = null; 
    }
}
public class LinkedList_day03_q1 {
      public static Node middleNode(Node head) {
        Node slower = head; 
        Node  faster = head; 
        while(faster != null && faster.next != null){
            slower = slower.next; 
            faster = faster.next.next; 
        }
        return slower; 
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null; 
        Node tail = null; 
        for(int i = 0 ; i < n ; i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if(head == null){
                head = newNode; 
                tail = newNode; 
            }else{
                tail.next = newNode; 
                tail = newNode; 
            }
        }
        Node middle = middleNode(head);
        System.out.println(middle.data);
    }
}

