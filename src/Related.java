import java.util.*;

public class Related<T>  {
    private Graph<T> adjNodes;
    private Graph<T> reciprocalAdjNodes;


    public Related(){
        adjNodes=new Graph<>();
        reciprocalAdjNodes=new Graph<>();
    }

    public Set<T> bfs(T root){
        Set<T> visited = new LinkedHashSet<>();
        Queue<T> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()){
            T node1 = queue.poll();
            for(Node<T> n : adjNodes.getAdjNodes().get(node1).getAdjNodes()){
                if(!visited.contains(n.getValue())) {
                    visited.add(n.getValue());
                    queue.add(n.getValue());
                }
            }
        }
        return visited;
    }
    public boolean addNode(T x){
        return adjNodes.addNode(x) && reciprocalAdjNodes.addNode(x);
    }
    public boolean addConnection(T from,T to){
        return adjNodes.addConnection(from,to) && reciprocalAdjNodes.addConnection(to,from);
    }
    public void print(T root){
        Set<T> original = bfs(root);
        for(T n : original){
            System.out.println(n);
        }
    }
    public boolean isStronglyConnected(T root){
        Set<T> original = bfs(root);
        Set<T> reciprocal = bfs(root);
        return original.size()==reciprocal.size() && original.size()==adjNodes.getAdjNodes().size();
    }
}
