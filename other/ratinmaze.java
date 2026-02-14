// Rat in a Maze
class Solution {
    public ArrayList < String > ratInMaze(int[][] maze) {
        // Write your code here
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        ArrayList < String > allPath = new ArrayList < > ();
        findAllPath(maze, 0, 0, n - 1, n - 1, "", visited, allPath);
        return allPath;
    }
    public static void findAllPath(int[][] matrix, int sr, int sc, int dr, int dc, String psf, boolean[][] visited, ArrayList < String > res) {
        // Base Condition
        // Negative Base Case
        if (sr < 0 || sc < 0 || sr > dr || sc > dc || matrix[sr][sc] == 0 || visited[sr][sc] == true) {
            return;
        }
        // Positive Base Case
        if (sr == dr && sc == dc) {
            res.add(psf);
            return;
        }
        visited[sr][sc] = true;
        // Down Direction
        findAllPath(matrix, sr + 1, sc, dr, dc, psf + "D", visited, res);
        // Left Direction
        findAllPath(matrix, sr, sc - 1, dr, dc, psf + "L", visited, res);
        // Right Direction
        findAllPath(matrix, sr, sc + 1, dr, dc, psf + "R", visited, res);
        // Up Direction
        findAllPath(matrix, sr - 1, sc, dr, dc, psf + "U", visited, res);
        visited[sr][sc] = false;
    }
}
