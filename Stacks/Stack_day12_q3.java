import java.util.*; 
class Stack_day12_q3{
     public static int[] dailyTemperatures(int[] temperatures) {
        int pointer = temperatures.length-1; 
        Stack <Integer> stack = new Stack<>();
        int[]  ans = new int[temperatures.length];
        while(pointer >= 0){
           if(!stack.isEmpty()){
               int stackIndex = stack.peek();
               if(temperatures[pointer] < temperatures[stackIndex]){
                      ans[pointer] = stackIndex - pointer; 
                      stack.push(pointer);
               }
               else{
                    
                    while(!stack.isEmpty() && temperatures[pointer] >= temperatures[stack.peek()]){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        ans[pointer] = 0; 
                    }else{
                    ans[pointer] = stack.peek()  - pointer; 
                    }
                    stack.push(pointer);

               }

           }else{
            stack.push(pointer);
            ans[pointer] = 0; 
           }
           pointer--; 
        }
        return ans; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temperatures = new int[n];
        for(int i = 0 ; i < n ; i++){
            temperatures[i] = sc.nextInt();
        }
        int[] ans = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(ans));
    }
}