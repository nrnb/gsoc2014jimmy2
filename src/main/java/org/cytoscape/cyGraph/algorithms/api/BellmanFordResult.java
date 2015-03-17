/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNode;

/**
 * Provides methods to get the shortest path, distance, etc. computed by
 * Bellman-Ford execution on a network or graph.
 * 
 * @author Jimmy
 * 
 */
public interface BellmanFordResult {

	/**
	 * Returns True if the CyNetwork has negative cycles and false otherwise.
	 * 
	 * @return True if the CyNetwork has negative cycles and false otherwise.
	 */
	public boolean hasNegativeCycle();

	/**
	 * Returns true if there is a path from the source CyNode to the target CyNode and false otherwise.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return True if there is path from the source CyNode to the target CyNode
	 *         and false otherwise.
	 */
	public boolean hasPathTo(CyNode target);

	/**
	 * Returns the source CyNode.
	 * 
	 * @return Source CyNode.
	 */
	public CyNode getSource();

	/**
	 * Returns the distance from source CyNode to target CyNode.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return Distance from the source CyNode to the target CyNode.
	 */
	public double getDistanceTo(CyNode target);

	/**
	 * Returns the predecessor of the target CyNode in the path from source
	 * CyNode to target CyNode.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return Predecessor of the target CyNode in the path from source CyNode
	 *         to target CyNode.
	 */
	public CyNode getPredecessorTo(CyNode target);

	/**
	 * Returns the path from the source CyNode to the target CyNode as a
	 * sequence of CyNodes.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return Sequence of nodes from source CyNode to target CyNode
	 *         constituting the shortest path.
	 */
	public Iterable<CyNode> getPathTo(CyNode target);
}
