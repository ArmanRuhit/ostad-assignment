public class task2 {

    static boolean count(int[][] maze, int r, int c) {
        // Base case: If the bottom-right corner is reached, return true
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            return true;
        }

        // If out of bounds, return false
        if (r == maze.length || c == maze[0].length) {
            return false;
        }

        boolean right = false;
        boolean down = false;

        // Move down if not blocked
        if (!isBlocked(maze, r + 1, c))
            down = count(maze, r + 1, c);

        // Move right if not blocked
        if (!isBlocked(maze, r, c + 1))
            right = count(maze, r, c + 1);

        // Return true if any of the paths (down or right) leads to the destination
        return down || right;
    }

    static boolean isBlocked(int[][] maze, int r, int c) {
        // If out of bounds, return false
        if (r == maze.length || c == maze[0].length)
            return false;

        // Return true if the cell is blocked (i.e., equals 1)
        return maze[r][c] == 1;
    }

    /**
     * Time Complexity: O(2^(m+n))
     * - In the worst case, for an m x n grid, each cell has 2 options: move right or move down.
     * - This leads to an exponential number of paths explored, resulting in O(2^(m+n)) time complexity.
     * - The time complexity can be further reduced using memoization to avoid redundant calculations.

     * Space Complexity: O(m + n)
     * - The maximum depth of the recursion stack is (m + n) in the worst case, where m is the number of rows and n is the number of columns.
     * - No additional data structures proportional to the size of the grid are used, so the space complexity is linear in the size of the grid.
     */
}
