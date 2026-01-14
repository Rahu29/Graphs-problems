void main() {
    //v1 -> v2
    //v1 -> v3
    //v2 -> v4
    //v3 -> v4

    Vertex v1 = new Vertex(1);
    Vertex v2 = new Vertex(2);
    Vertex v3 = new Vertex(3);
    Vertex v4 = new Vertex(4);

    v1.getAdjElement(v2);
    v1.getAdjElement(v3);
    v2.getAdjElement(v4);
    v3.getAdjElement(v4);

    TopologicalSort topo = new TopologicalSort();
    topo.topoSort(v1);

    topo.printStack();
}
