package Graph;

class GraphMatrix {
    private int[][] matrix;
    private int vertices;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1; //  undirected graph and put grpah  matrix[u][v] = 1 for directed
    }

    public void printMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.printMatrix();
    }
               
}
