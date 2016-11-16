public class Graph {
	int[][] g;
	int node;

	Graph(int v) {
		node = v;
		g= new int[node][node];
		int i, j;
		for(i=0;i<node; i++) {
			for(j=0; j<node; j++) {
				g[i][j]=0;
			}
		}
	}
	public void vertex(int v, int u) {
		g[v-1][u-1] = 1;
		g[u-1][v-1] = 1;
	}
	public void display() {
		int i, j;
		for(i=0; i<node; i++) {
			for(j=0; j<node; j++) {
				System.out.print(g[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public int getDegree(int v) {
		int deg=0;
		for(int i=0; i<node; i++) {
			if((v-1)==i) {
				for(int j=0; j<node; j++) {
					if(g[i][j]==1)
						deg++;
				}
				return deg;
			}
		}
		return deg;
	}
}
