package breadth_first_search;

import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.*;
/**
 * Created by jhoni on 31/01/2017.
 */
public class BFS {

    public void bfs(Vertex root){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);

        root.setVisited(true);
        while (!queue.isEmpty()){
            Vertex actualVertex = queue.remove();
            out.println(actualVertex + " ");

            for (Vertex vertex : actualVertex.getNeighbourList()) {
                if(!vertex.getVisited()){
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }

    }
}
