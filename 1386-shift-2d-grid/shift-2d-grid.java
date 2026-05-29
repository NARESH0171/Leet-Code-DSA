class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<List<Integer>> result = new ArrayList();
        int rows = grid.length, col = grid[0].length;

        for (int r=0; r<rows; r++) // filling all the rows of result with empty list
        result.add(new ArrayList());

        k %= (rows * col); //every rows*col

        int dimension = rows * col;
        int begin = dimension - k;
        int x = 0;

        for(int i=begin; i<begin + dimension; i++){
            int r = (i/col) % rows,  c= i % col; // calculating
            result.get(x / col).add(grid[r][c]); // adding new element
            x++;
        }
        return result; // resturing reslut list
    }
}