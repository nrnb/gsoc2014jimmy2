/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNode;

/**
 * Provides methods to access get shortest path from source CyNode to other
 * CyNodes, distance, etc. as computed by Dijkstra's algorithm.
 * 
 * @author Jimmy
 * 
 */
public interface DijkstraResult {

	/**
	 * Returns the distance from source CyNode to target CyNode.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return Distance from the source CyNode to the target CyNode.
	 */
	public double getDistanceTo(CyNode target);

	/**
	 * Returns the source CyNode.
	 * 
	 * @return Source CyNode.
	 */
	public CyNode getSource();

	/**
	 * Returns True if there is a path from the source CyNode to the target
	 * CyNode and False otherwise.
	 * 
	 * @param target
	 *            Target CyNode.
	 * @return True if there is path from the source CyNode to the target CyNode
	 *         and False otherwise.
	 */
	public boolean hasPathTo(CyNode target);

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
	 * @return Sequence of nodes from source CyNode to target CyNode.
	 */
	public Iterable<CyNode> getPathTo(CyNode target);

	/**
	 * Returns the eccentricity of the source CyNode.
	 * 
	 * @return Eccentricity of the source CyNode.
	 */
	public double getEccentricity();
}
