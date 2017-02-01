package iddfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhoni on 31/01/2017.
 */
public class Node {

    private String name;
    private Integer depthLevel = 0;
    private List<Node> adjanciesList;

    public Node(String name) {
        this.name = name;
        this.adjanciesList = new ArrayList<>();
    }

    public void addNeighbour(Node node){
        this.adjanciesList.add(node);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(Integer depthLevel) {
        this.depthLevel = depthLevel;
    }

    public List<Node> getAdjanciesList() {
        return adjanciesList;
    }

    public void setAdjanciesList(List<Node> adjanciesList) {
        this.adjanciesList = adjanciesList;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
