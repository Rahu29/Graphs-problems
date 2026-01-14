import java.util.Stack;

public class TopologicalSort {

    Stack<Vertex> stack = new Stack<>();

    public void topoSort(Vertex v){
        v.setVisited(true);

        for(Vertex adjElements: v.getAdjElement()){
            if(!adjElements.isVisited()){
                topoSort(adjElements);
            }
        }
        stack.push(v);
    }

    public void printStack(){
        while(!stack.isEmpty()){
            System.out.println(stack.pop().getValue());
        }
    }

}
