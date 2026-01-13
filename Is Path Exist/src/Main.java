void main() {
    //Here 0 -> path and 1 -> Walls
    int[][] maze = {
            {0, 0, 0, 0},
            {0, 0, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 0, 0}
    };

    Vertex v = new Vertex(maze);

    if(v.isRouteExist(0, 0)){
        System.out.println("Route Exist...");
    } else{
        System.out.println("Route does not Exist...");
    }
}
