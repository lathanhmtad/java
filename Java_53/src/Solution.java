public class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length <= 2) return false;
        boolean increase = false;
        boolean decrease = false;
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) break;
            if(arr[i] == arr[i + 1]) return false;
            
            // increase
            if(arr[i + 1] > arr[i]) 
                increase = true;
            else 
                decrease = true;
            
            if(decrease)
                if(arr[i] > arr[i + 1])
                    decrease = true;
                else 
                    return false;
        }
        if(increase && decrease)
            return true;
        return false;
    }
}