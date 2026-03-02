 import java.util.*; 
 //day 03
 //determine if the linked list has a cycle in it.
 //https://leetcode.com/problems/linked-list-cycle/description/
 class Node{
    int data ; 
    Node next; 
    Node(int data){
          this.data = data; 
          this.next = null; 
    }
}


public class LinkedList_day03_q2 {
        public  static boolean hasCycle(Node head) {
        if(head == null || head.next == null){
            return false;
        }
        boolean isCycle = false; 
        Node slower = head; 
        Node faster = head; 
        while(faster != null  && faster.next != null){
            
            slower = slower.next; 
            faster = faster.next.next; 
            if(slower == faster){
                return true;  
            }
            
        }
        return false;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        Node head = null; 
        Node tail = null;
         Node CycleNode = null; 
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

            if(i == pos){
                CycleNode = newNode; 
            }
        }
        if(pos != -1){
            tail.next = CycleNode; 
        }
        boolean isCycle = hasCycle(head);
        System.out.println(isCycle);
    }
}

