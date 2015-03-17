/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNode;

/**
 * Provides methods to get the shortest path and distance from source CyNode to
 * other CyNodes computed by breadth first search.
 * 
 * @author Jimmy
 * 
 */
public interface BfsResult {

	/**
	 * Returns the distance from source CyNode to target CyNode.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return Distance from the source CyNode to the target CyNode.
	 */
	public int getDistanceTo(CyNode target);

	/**
	 * Returns the source CyNode.
	 * 
	 * @return Source CyNode.
	 */
	public CyNode getSource();

	/**
	 * Returns True if there is a path from the source CyNode to the target
	 * CyNode and false otherwise.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return True if there is path from the source CyNode to the target CyNode
	 *         and false otherwise.
	 */
	public boolean hasPathTo(CyNode target);

	/**
	 * Returns the path from the source CyNode to the target CyNode as a
	 * sequence of CyNodes.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return Sequence of nodes from source CyNode to target CyNode.
	 */
	public Iterable<CyNode> getPathTo(CyNode target);

}
