/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyEdge;
import org.cytoscape.model.CyNode;

/**
 * Provides methods to get shortest path between a given pair of nodes, negative
 * cycle if one exists, etc. as computed by Floyd-Warshall algorithm.
 * 
 * @author Jimmy
 * 
 */
public interface FloydWarshallResult {

	/**
	 * Returns True if the CyNetwork has negative cycles and False otherwise.
	 * 
	 * @return True if the CyNetwork has negative cycles and False otherwise.
	 */
	public boolean hasNegativeCycle();

	/**
	 * Returns True if there is a path from the source CyNode to the target
	 * CyNode and False otherwise.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return True if there is path from the source CyNode to the target CyNode
	 *         and False otherwise.
	 */
	public boolean hasPath(CyNode source, CyNode target);

	/**
	 * Returns the distance from the source CyNode to target CyNode.
	 * 
	 * @param source
	 *            Source CyNode
	 * @param target
	 *            Target CyNode
	 * @return Distance from the source CyNode to target CyNode.
	 */
	public double getDistance(CyNode source, CyNode target);

	/**
	 * Returns the shortest path from the source CyNode to the target CyNode as
	 * a sequence of CyEdges.
	 * 
	 * @param source
	 *            Source CyNode.
	 * @param target
	 *            Target CyNode.
	 * @return Sequence of CyEdges from the source CyNode to the target CyNode
	 *         constituting the shortest path.
	 */
	public Iterable<CyEdge> getPath(CyNode source, CyNode target);

	/**
	 * Returns a sequence of CyEdges from the source CyNode to the target CyNode
	 * constituting the negative cycle.
	 * 
	 * @return Sequence of CyEdges from the source CyNode to the target CyNode
	 *         constituting the negative cycle.
	 */
	public Iterable<CyEdge> getNegativeCycle();
}
