class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        
        if(n == 1){
            for(int j=0; j<m; j++){
                list.add(mat[0][j]);
            }
            
            return list;
        }
        
        if(m == 1){
            for(int i=0; i<n; i++){
                list.add(mat[i][0]);
            }
            
            return list;
        }
        
        for(int j=0; j<m; j++){
            list.add(mat[0][j]);
        }
        
        for(int i=1; i<n; i++){
            list.add(mat[i][m-1]);
        }
        
        for(int j=m-2; j>=0; j--){
            list.add(mat[n-1][j]);
        }
        
        for(int i=n-2; i>0; i--){
            list.add(mat[i][0]);
        }
       
        return list;
    }
}
