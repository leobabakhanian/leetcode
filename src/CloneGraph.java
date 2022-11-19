import java.util.HashMap;

public class CloneGraph {
	public HashMap<Integer, Node> map = new HashMap<>();
	
	public Node cloneGraph(Node node) {
        return clone(node);
    }
	
	private Node clone(Node node) {
		if(node == null)
			return null;
		
		if(map.containsKey(node.val))
			return map.get(node.val);
		
		Node newNode = new Node(node.val, new ArrayList<Node>());
		
		map.put(newNode.val, newNode);
		
		for(Node neighbor: node.neighbors)
			newNode.neighbors.add(clone(neighbor));
		
		return newNode;
	}
}
