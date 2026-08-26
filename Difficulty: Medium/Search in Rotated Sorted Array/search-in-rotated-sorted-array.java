class Solution {
    int search(int[] arr, int key) {
        // code here
        int n = arr.length;
        
        int low = 0;
        int high = n - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == key){
                return mid;
            }
            
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
            }
           else if(arr[low] <= arr[mid]){
               if(arr[low] <= key && arr[mid] > key){
                   high = mid - 1;
               }else{
                   low = mid + 1;
               }
           }else{
               if(arr[mid] < key && arr[high] >= key){
                   low = mid + 1;
               }else{
                   high = mid - 1;
               }
           }
        }
        
        return -1;
    }
}