class Solution {

    void makeZeros(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int[][] temp = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                temp[i][j] = mat[i][j];
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                int sum = 0;
                if(mat[i][j] == 0){
                    if(i-1 >= 0){
                        sum += mat[i-1][j];
                        temp[i-1][j] = 0;
                    }
                    
                    if(i+1 < n){
                        sum += mat[i+1][j];
                        temp[i+1][j] = 0;
                    }
                    
                    if(j-1 >= 0){
                        sum += mat[i][j-1];
                        temp[i][j-1] = 0;
                    }
                    
                    if(j+1 < m){
                        sum += mat[i][j+1];
                        temp[i][j+1] = 0;
                    }
                    
                    temp[i][j] = sum;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = temp[i][j];
            }
        }
    }
}