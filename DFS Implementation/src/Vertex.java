import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int value;
    private boolean isVisited;
    private List<Vertex> adjList;

    public Vertex(int val){
        this.value = val;
        this.adjList = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIsVisited(boolean value) {
        this.isVisited = value;
    }

    public boolean getIsVisited() {
        return this.isVisited;
    }

    public List<Vertex> getAdjList() {
        return adjList;
    }

    public void setAdjElement(Vertex v) {
        adjList.add(v);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                ", isVisited=" + isVisited +
                ", adjList=" + adjList +
                '}';
    }
}