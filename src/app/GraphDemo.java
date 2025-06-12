package app;

public class GraphDemo {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Додаємо вершини та ребра
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("Граф після додавання вершин та ребер:");
        graph.printGraph();

        // Перевірка існування вершин та ребер
        System.out.println("\nПеревірка існування вершин та ребер:");
        System.out.println("hasVertex(2): " + graph.hasVertex(2));
        System.out.println("hasEdge(1, 2): " + graph.hasEdge(1, 2));
        System.out.println("hasEdge(1, 3): " + graph.hasEdge(1, 3));

        // Видаляємо ребро
        graph.removeEdge(1, 2);
        System.out.println("\nПісля видалення ребра (1, 2):");
        graph.printGraph();

        // Видаляємо вершину
        graph.removeVertex(2);
        System.out.println("\nПісля видалення вершини 2:");
        graph.printGraph();
    }
}

