package depth_first_search;

import javax.xml.bind.ValidationEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhoni on 31/01/2017.
 */
public class Vertex {

    private String name;

    private Boolean visited = false;

    private List<Vertex> neighbourList;

    public Vertex(String name){
        this.name = name;
        this.neighbourList = new ArrayList<>();
    }

    public void addNeighbourVertex(Vertex vertex){
        this.neighbourList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
