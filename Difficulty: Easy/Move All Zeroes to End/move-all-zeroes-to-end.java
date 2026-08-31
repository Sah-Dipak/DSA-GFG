class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                list.add(arr[i]);
            }
        }
        
        for(int i=0; i<n; i++){
            arr[i] = list.get(i);
        }
        
        
    }
}