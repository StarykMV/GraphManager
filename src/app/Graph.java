package app;
import java.util.*;

public class Graph {
    private Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Додаємо вершину
    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }

    // Додаємо ребро
    public void addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // Видаляємо вершину
    public void removeVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) return;
        {
        }
        for (int neighbor : adjacencyList.get(vertex)) {
            adjacencyList.get(neighbor).remove(vertex);
        }
        adjacencyList.remove(vertex);
    }

    // Видаляємо ребро
    public void removeEdge(int source, int destination) {
        if (adjacencyList.containsKey(source)) {
            adjacencyList.get(source).remove(destination);
    }
        if (adjacencyList.containsKey(destination)) {
            adjacencyList.get(destination).remove(source);
        }
}

    // Чи існує вершина
    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    // Чи існує ребро
    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
    }

    // Виводимо граф
    public void printGraph() {
        for (var entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
