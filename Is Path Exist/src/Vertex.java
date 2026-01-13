public class Vertex {

    private int[][] maze;
    private boolean[][] isVisited;

    Vertex(int[][] maze){
        this.maze = maze;
        isVisited = new boolean[maze.length][maze.length];
    }

    public int[][] getMaze() {
        return maze;
    }

    private boolean isFeasibleMove(int row, int col){
        if(row < 0 || col < 0){
            return false;
        }
        if(row > maze.length - 1 || col > maze.length - 1){
            return false;
        }
        if(isVisited[row][col]){
            return false;
        }
        if(maze[row][col] == 1){
            return false;
        }
        return true;
    }

    public Boolean isRouteExist(int row, int col){
        if(row == maze.length - 1 && col == maze.length - 1){
            return true;
        }

        if(isFeasibleMove(row, col)){

            isVisited[row][col] = true;

            if(isRouteExist(row+1, col)){
                return true;
            }

            if(isRouteExist(row-1, col)){
                return true;
            }

            if(isRouteExist(row, col+1)){
                return true;
            }

            if(isRouteExist(row, col-1)){
                return true;
            }

            isVisited[row][col] = false;
        }
    return false;
    }
}
