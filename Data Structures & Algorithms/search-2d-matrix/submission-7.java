class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //we get the row
        int top = 0;
        int bottom = matrix.length - 1;
        int columns = matrix[0].length - 1;

        while(top <= bottom){
            int mid = (top + bottom)/2;
            int curr = matrix[mid][columns];
            if(curr > target){
                bottom = mid - 1;
            }
            else if(curr < target){
                top = mid + 1;
            }
            else{
                return true;
            }
        }
        if(top >= matrix.length){
            return false;
        }
        int row = top;//row
        System.out.println("row" + row);

        int left = 0;
        int right = matrix[0].length - 1;

        while(left <= right){
            int mid = (left + right)/2;
            int curr = matrix[row][mid];
            if(curr > target){
                right = mid - 1;
            }
            else if(curr < target){
                left = mid + 1;
            }
            else{
                return true;
            }
        }

    return false;
        
    }
}
