import java.util.*; 
class Stack_day04_q2{
    public static int[] nextLargerElement(int[] arr) {
       Stack <Integer> store = new Stack<>();
       int[] res = new int[arr.length];
       for(int i = arr.length-1 ; i >= 0 ; i--){
         
          while(!store.isEmpty() && store.peek() <= arr[i]){
                store.pop();
            }
               
            if(store.isEmpty()){
                
                res[i] = -1; 
            }else{
                
                 res[i] = store.peek();
            }
            store.push(arr[i]);
       }
        return res;  
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = nextLargerElement(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
        
        
    }
}

