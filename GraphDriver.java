import java.util.Scanner;

public class GraphDriver {
	public static void main(String[] args) {
		int i, j, vertices;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num of nodes you want to insert");
		vertices = scan.nextInt();
		Graph graph = new Graph(vertices);

		for(int k= 0; k < vertices; k++) {
			System.out.println("Enter the nodes in format (vertex, edge) ");
			graph.vertex(scan.nextInt(), scan.nextInt());
		}
		graph.display();
		System.out.println(" enter the vertex whose degree you want");
		System.out.println("degree =" + graph.getDegree(scan.nextInt()));
	}
}
