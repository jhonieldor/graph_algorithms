package iddfs;

import breadth_first_search.Vertex;

import java.util.Stack;

import static java.lang.System.*;

/**
 * Created by jhoni on 31/01/2017.
 */
public class Algorithm {

    private Node targetVertex;
    private volatile Boolean isTargetFound = false;

    public Algorithm(Node targetVertex) {
        this.targetVertex = targetVertex;
    }

    public void runDeepiningSearch(Node rootVertex) {
        Integer depth = 0;

        while (!isTargetFound) {
            out.println();
            dfs(rootVertex, depth);
            depth++;
        }
    }

    private void dfs(Node sourceVertex, Integer depthLevel) {
        Stack<Node> stack = new Stack<>();
        sourceVertex.setDepthLevel(0);
        stack.push(sourceVertex);

        while (!stack.isEmpty()) {
            Node actualNode = stack.pop();
            out.println(actualNode + " ");
            if (actualNode.getName().equals(this.targetVertex.getName())) {
                out.println("Node has been found...");
                this.isTargetFound = true;
                return;
            }
            if (actualNode.getDepthLevel() >= depthLevel) {
                continue;
            }

            for (Node node : actualNode.getAdjanciesList()) {
                node.setDepthLevel(actualNode.getDepthLevel() + 1);
                stack.push(node);
            }
        }

    }
}
