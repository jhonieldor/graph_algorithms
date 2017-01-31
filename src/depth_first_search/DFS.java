package depth_first_search;

import java.util.List;
import java.util.Stack;
import static java.lang.System.*;

/**
 * Created by jhoni on 31/01/2017.
 */
public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public DFS(Stack<Vertex> stack) {
        this.stack = stack;
    }

    public void dfs(List<Vertex> vertexList){
        for (Vertex vertex : vertexList) {
            if(!vertex.getVisited()){
                vertex.setVisited(true);
                dfsWithStack(vertex);
            }
        }
    }

    private void dfsWithStack(Vertex rootVertex){
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while (!stack.isEmpty()){
            Vertex actualVertex = this.stack.pop();
            out.println(actualVertex + " ");

            for(Vertex v: actualVertex.getNeighbourList()){
                if(!v.getVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
    
}
