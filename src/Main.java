public class Main {
    public static void main(String[] args) {

        System.out.println("Hola");
        Related<String> graph =new Related<>();
        Related<String> graph1 =new Related<>();

        graph.addNode("u");
        graph.addNode("x");
        graph.addNode("v");
        graph.addNode("y");
        graph.addNode("z");
        graph.addConnection("u","x");
        graph.addConnection("x","y");
        graph.addConnection("y","z");
        graph.addConnection("z","y");
        graph.addConnection("y","v");
        graph.addConnection("v","u");
        graph.print("u");
        System.out.println("Is the graph strongly conected: "+graph.isStronglyConnected("u"));


        graph1.addNode("u");
        graph1.addNode("x");
        graph1.addNode("v");
        graph1.addNode("y");
        graph1.addNode("z");
        graph1.addConnection("u","x");
        graph1.addConnection("x","y");
        graph1.addConnection("y","v");
        graph1.addConnection("v","u");
        graph1.print("u");
        System.out.println("Is the graph1 strongly conected: "+graph1.isStronglyConnected("u"));
    }
}