import java.util.*; 

class ListNode{
    ListNode next;  
    int data ;
    ListNode(int data){
        this.data = data; 
        this.next = null; 
    }
}
public class LinkedList_day16_q3 {
    public static ListNode ReverseList(ListNode head){
        ListNode curr= head; 
        ListNode prev = null; 
        while(curr != null){
            ListNode nextN = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = nextN; 
        }
        return prev; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        ListNode head = null; 
        ListNode tail = null; 
        for(int i = 0 ; i < n ; i++){
               int temp = sc.nextInt();
               ListNode tempN = new ListNode(temp);
               if(head == null){
                 head = tempN; 
                 tail = tempN; 
               }else{
               tail.next = tempN; 
                tail = tempN; 
               }
        }
        ListNode rev = ReverseList(head);
        while(rev != null){
            System.out.print(rev.data + " ");
            rev = rev.next; 
        }
    }
}
