/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNetwork;
import org.cytoscape.model.CyNode;

/**
 * <code>GraphAlgorithms</code> is the primary interface providing access to a
 * number of graph algorithms. These include breadth first search, depth first
 * search, Bellman-Ford, Dijkstra, Floyd-Warshall, Prim, Kruskal, Pagerank and
 * HITS.
 * 
 * @author Jimmy
 * 
 */
public interface GraphAlgorithms {

	/**
	 * Performs breadth first search on a CyNetwork starting from a given source
	 * CyNode. Breadth first search is a graph search algorithm.
	 * 
	 * @param network
	 *            CyNetwork containing the source node from which the user wants
	 *            to perform breadth first search.
	 * @param source
	 *            Source CyNode.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param callback
	 *            Callback function
	 * @return
	 * @see <a href =
	 *      "http://en.wikipedia.org/wiki/Breadth-first_search">Breadth First
	 *      Search</a>
	 */
	public BfsResult breadthFirstSearch(CyNetwork network, CyNode source,
			boolean directed, Callback callback);

	/**
	 * Performs depth first search on a CyNetwork starting from a given source
	 * CyNode. Depth first search is a graph search algorithm.
	 * 
	 * @param network
	 *            CyNetwork containing the source node from which the user wants
	 *            to perform depth first search.
	 * @param source
	 *            Source CyNode.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param callback
	 *            Callback function
	 * @return
	 * @see <a href = "http://en.wikipedia.org/wiki/Depth-first_search">Depth
	 *      First Search</a>
	 */
	public DfsResult depthFirstSearch(CyNetwork network, CyNode source,
			boolean directed, Callback callback);

	/**
	 * Computes all pairs shortest path on a CyNetwork using the Floyd Warshall
	 * algorithm.
	 * 
	 * @param network
	 *            CyNetwork
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return
	 * @see <a href =
	 *      "http://en.wikipedia.org/wiki/Floyd%E2%80%93Warshall_algorithm">Floyd-Warshall</a>
	 */
	public FloydWarshallResult findAllPairShortestPath(CyNetwork network,
			boolean directed, WeightFunction function);

	/**
	 * Finds the minimum spanning tree of a CyNetwork using Kruskal's algorithm.
	 * 
	 * @param network
	 *            CyNetwork
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return
	 * @see <a href =
	 *      "http://en.wikipedia.org/wiki/Kruskal%27s_algorithm">Kruskal's
	 *      algorithm</a>
	 */
	public MSTResult findKruskalTree(CyNetwork network, WeightFunction function);

	/**
	 * Computes the shortest paths from a source CyNode to all the other nodes
	 * in a CyNetwork.
	 * 
	 * @param network
	 *            CyNetwork
	 * @param source
	 *            Source CyNode.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return
	 * @see <a href =
	 *      "http://en.wikipedia.org/wiki/Dijkstra%27s_algorithm">Dijkstra's
	 *      algorithm</a>
	 */
	public DijkstraResult findPath(CyNetwork network, CyNode source,
			boolean directed, WeightFunction function);

	/**
	 * Finds the minimum spanning tree of a CyNetwork using Prim's algorithm.
	 * 
	 * @param network
	 *            CyNetwork for which the user wants to find the minimum
	 *            spanning tree.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return
	 * @see <a href = "http://en.wikipedia.org/wiki/Prim%27s_algorithm">Prim's
	 *      algorithm</a>
	 */
	public MSTResult findPrimTree(CyNetwork network, WeightFunction function);

	/**
	 * Finds shortest paths from a source CyNode to all the other nodes in a
	 * CyNetwork. Useful when the network contains negative cycles.
	 * 
	 * @param network
	 *            CyNetwork containing the source node and the other nodes to
	 *            which the user wants to find the shortest path.
	 * @param source
	 *            Source CyNode.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return
	 * @see <a href =
	 *      "http://en.wikipedia.org/wiki/Bellman-Ford_algorithm">Bellman-Ford
	 *      algorithm</a>
	 */
	public BellmanFordResult findShortestPath(CyNetwork network, CyNode source,
			boolean directed, WeightFunction function);

	/**
	 * Computes the hub and authority values of CyNodes in a CyNetwork.
	 * 
	 * @param network
	 *            CyNetwork containing the nodes for which the user wants to
	 *            compute HITS scores.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @return An instance of HITSResults that provides methods to access the
	 *         hub and authority values of a node.
	 * @see <a href = "http://en.wikipedia.org/wiki/HITS_algorithm">HITS
	 *      algorithm</a>
	 */
	public HITSResults getHITSScores(CyNetwork network, boolean directed);

	/**
	 * Computes the pagerank of CyNodes in a CyNetwork.
	 * 
	 * @param network
	 *            CyNetwork containing the nodes for which the user wants to
	 *            compute pagerank scores.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @return An instance of PagerankResults that provides methods to access
	 *         the pagerank score.
	 * @see <a href = "http://en.wikipedia.org/wiki/PageRank">Pagerank
	 *      algorithm</a>
	 */
	public PagerankResults getPageranks(CyNetwork network,
			WeightFunction function, boolean directed);

	/**
	 * Computes the pagerank of CyNodes in a CyNetwork with the probability and
	 * epsilon value provided by the user.
	 * 
	 * @param network
	 *            CyNetwork containing the nodes for which the user wants to
	 *            compute pagerank scores.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param probability
	 *            Probability value alpha to be used in the computation of
	 *            pagerank scores. The default is 0.85.
	 * @param epsilon
	 *            Epsilon value to be used in pagerank computation. The default
	 *            is 0.001.
	 * @return An instance of PagerankResults that provides methods to access
	 *         the pagerank score.
	 * @see <a href = "http://en.wikipedia.org/wiki/PageRank">Pagerank
	 *      algorithm</a>
	 */
	public PagerankResults getPageranks(CyNetwork network,
			WeightFunction function, boolean directed, double probability,
			double epsilon);

}
