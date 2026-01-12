import java.util.Stack;

public class DFS {

    public void Dfs(Vertex v){
        Stack<Vertex> stack = new Stack<>();

        v.setIsVisited(true);
        stack.push(v);

        while(!stack.isEmpty()){
            Vertex current = stack.pop();
            System.out.println(current.getValue());

            for(Vertex adjEle: current.getAdjList()){
                if(!adjEle.getIsVisited()){
                    adjEle.setIsVisited(true);
                    stack.push(adjEle);
                }
            }
        }
    }
}
