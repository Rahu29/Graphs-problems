import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void printAllElements(Vertex v){
        Queue<Vertex> queue = new LinkedList<>();

        v.setIsVisited(true);
        queue.add(v);

        while(!queue.isEmpty()){
            Vertex currentVertex = queue.poll();
            System.out.println(currentVertex.getValue());

            for(Vertex ver: currentVertex.getAdjList()){
                if(!ver.getIsVisited()){
                    ver.setIsVisited(true);
                    queue.add(ver);
                }
            }
        }
    }

}