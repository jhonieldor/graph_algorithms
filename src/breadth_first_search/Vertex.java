package breadth_first_search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhoni on 31/01/2017.
 */
public class Vertex {

    private Integer data;

    private Boolean visited = false;

    private List<Vertex> neighbourList;

    public Vertex(Integer data){
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
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

    public void addNeighbourVertex(Vertex vertex){
        this.neighbourList.add(vertex);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }
}
