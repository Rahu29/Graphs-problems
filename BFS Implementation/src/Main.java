void main() {
//    1-> 3 6 7 8
//    2-> 3 4 5 6
//    3-> 1 2 6
//    4-> 8 7 2 4
//    5-> 5 6 2
//    6-> 1
//    7-> 8

    Vertex v1 = new Vertex(1);
    Vertex v2 = new Vertex(2);
    Vertex v3 = new Vertex(3);
    Vertex v4 = new Vertex(4);
    Vertex v5 = new Vertex(5);
    Vertex v6 = new Vertex(6);
    Vertex v7 = new Vertex(7);
    Vertex v8 = new Vertex(8);

    v1.setAdjElement(v3);
    v1.setAdjElement(v6);
    v1.setAdjElement(v7);
    v1.setAdjElement(v8);
    v2.setAdjElement(v3);
    v2.setAdjElement(v4);
    v2.setAdjElement(v5);
    v2.setAdjElement(v6);
    v3.setAdjElement(v1);
    v3.setAdjElement(v2);
    v3.setAdjElement(v6);
    v4.setAdjElement(v8);
    v4.setAdjElement(v7);
    v4.setAdjElement(v2);
    v4.setAdjElement(v4);
    v5.setAdjElement(v5);
    v5.setAdjElement(v6);
    v5.setAdjElement(v2);
    v6.setAdjElement(v1);
    v7.setAdjElement(v8);

    BFS bfs = new BFS();
    bfs.printAllElements(v5);

}
