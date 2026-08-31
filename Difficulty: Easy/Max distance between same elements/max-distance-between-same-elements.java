class Solution {
    public int maxDistance(int[] arr) {
        // Code here
       HashMap<Integer, Integer> first = new HashMap<>();
       int ans = 0;

       for (int i = 0; i < arr.length; i++) {

           if (!first.containsKey(arr[i])) {
               first.put(arr[i], i);
           } else {
               ans = Math.max(ans, i - first.get(arr[i]));
           }
       }

       return ans;
    }
}