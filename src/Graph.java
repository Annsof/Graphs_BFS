import java.util.*;

public class Graph<T> {


    private Map<T, Node<T>> adjNodes;

    public Graph(){
        adjNodes=new HashMap<>();
    }
    public boolean addNode(T x){
        if(!adjNodes.containsKey(x)) {
            adjNodes.put(x, new Node<>(x));
            return true;
        }else {
            return false;
        }
    }
    public boolean addConnection(T from, T to){
        if(adjNodes.containsKey(from)&&adjNodes.containsKey(to)){
            adjNodes.get(from).getAdjNodes().add(new Node<>(to));
            return true;
        }else {
            return false;
        }
    }

    public Map<T, Node<T>> getAdjNodes() {
        return adjNodes;
    }

    public void setAdjNodes(Map<T, Node<T>> adjNodes) {
        this.adjNodes = adjNodes;
    }
}
