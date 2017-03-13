package pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphDFSSearch {

	private static String START;
	private static String END;;

	public static void main(String[] args) throws IOException {
		UndirectGraph graph = new UndirectGraph();
		BufferedReader br = new BufferedReader(new FileReader("input_1.txt"));
		String sCurrentLine;
		List<String> lines = new ArrayList<>();
		while ((sCurrentLine = br.readLine()) != null) {
			lines.add(sCurrentLine);

		}
		br.close();
		String[] startnodes = lines.get(0).split(" ");
		START = startnodes[0];
		END = startnodes[1];
		for (int i = 1; i < lines.size(); i++) {
			String[] nodes = lines.get(i).split(":");
			String fromEdge = nodes[0];
			String[] toEdge = nodes[i].split(" ");
			for (String str : toEdge)
				graph.addEdge(fromEdge, str);

		}
		LinkedList<String> visited = new LinkedList<>();
		visited.add(START);
		new GraphDFSSearch().depthFirst(graph, visited);
	}

	private void depthFirst(UndirectGraph graph, LinkedList<String> visited) {
		LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
		for (String node : nodes) {
			if (visited.contains(node)) {
				continue;
			}
			if (node.equals(END)) {
				visited.add(node);
				printPath(visited);
				visited.removeLast();
				break;
			}
		}
		for (String node : nodes) {
			if (visited.contains(node) || node.equals(END)) {
				continue;
			}
			visited.addLast(node);
			depthFirst(graph, visited);
			visited.removeLast();
		}
	}

	private void printPath(LinkedList<String> visited) {
		for (String node : visited) {
			System.out.print(node);
			System.out.print(" ");
		}
		System.out.println();
	}
}


