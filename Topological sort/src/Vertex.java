import java.util.*;

public class Vertex {

    private int value;
    private boolean isVisited;
    private List<Vertex> adjElement;

    Vertex(int value){
        this.value = value;
        this.adjElement = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean value) {
        this.isVisited = value;
    }

    public List<Vertex> getAdjElement() {
        return adjElement;
    }

    public void getAdjElement(Vertex v) {
        this.adjElement.add(v);
    }
}
