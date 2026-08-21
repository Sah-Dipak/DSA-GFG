class Solution {
    
    static int getLowerBound(int[] arr , int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans = n;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] >= target){
                ans = mid;
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    
    
    static int getUpperBound(int[] arr ,int  target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans = n;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] <= target){
                left = mid + 1;
            }else{
                ans = mid;
                right = mid - 1;
            }
        }
        
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        
        int lowerBound = getLowerBound( arr , target);
        int upperBound = getUpperBound(arr , target);
        
        int result = upperBound - lowerBound;
        
        return result;
      
    }
}
