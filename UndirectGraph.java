/**
 * 
 */
package pkg;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class UndirectGraph {
	private Map<String, LinkedHashSet<String>> map = new HashMap<>();

	public void addEdge(String node1, String node2) {
		LinkedHashSet<String> adjacentFirst = map.get(node1);
		if (adjacentFirst == null) {
			adjacentFirst = new LinkedHashSet<>();
			map.put(node1, adjacentFirst);
		}
		adjacentFirst.add(node2);
	}

	public boolean isConnected(String node1, String node2) {
		LinkedHashSet<String> adjacent = map.get(node1);
		if (adjacent == null) {
			return false;
		}
		return adjacent.contains(node2);
	}

	public void addTwoWayVertex(String node1, String node2) {
		addEdge(node1, node2);
		addEdge(node2, node1);
	}

	public LinkedList<String> adjacentNodes(String last) {
		LinkedHashSet<String> adjacent = map.get(last);
		if (adjacent == null) {
			return new LinkedList<>();
		}
		return new LinkedList<String>(adjacent);
	}
}
