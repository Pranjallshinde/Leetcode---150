//Time Complexity: O(log(m * n))
//Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns
        
        int low = 0;
        int high = m * n - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}
