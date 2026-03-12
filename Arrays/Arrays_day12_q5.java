import java.util.*; 
public class Arrays_day12_q5{
    
     public static boolean lemonadeChange(int[] bills) {
        int FiveCounts = 0; 
        int TenthCounts = 0; 
        for(int i = 0 ; i < bills.length ; i++){
            if(bills[i] == 5){
                FiveCounts++; 
            }
            else{
                if(bills[i] == 10){
                    if(FiveCounts >=1){
                        FiveCounts -=1 ; 
                        TenthCounts += 1; 
                    }else{
                        return false; 
                    }
                }
                if(bills[i] == 20){
                    if(TenthCounts >=1){
                        TenthCounts -= 1; 
                        if(FiveCounts < 1){
                            return false; 
                        }else{
                            FiveCounts -= 1; 
                        }
                    }else if(FiveCounts >= 3){
                        FiveCounts -= 3; 
                    }else{
                        return false; 
                    }
                }
            }
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

        }
        boolean CanReturn = lemonadeChange(arr);
        System.out.println(CanReturn);
    }
}