import java.util.ArrayList;

public class Node<T>{
    private T value;
    private ArrayList<Node<T>> adjNodes;

    public Node(T value) {
        this.value = value;
        this.adjNodes=new ArrayList<>();
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArrayList<Node<T>> getAdjNodes() {
        return adjNodes;
    }

    public void setAdjNodes(ArrayList<Node<T>> adjNodes) {
        this.adjNodes = adjNodes;
    }
}
