/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyEdge;

/**
 * Provides methods to get the weight of the minimum spanning tree and the
 * minimum spanning tree itself.
 * 
 * @author Jimmy
 * 
 */
public interface MSTResult {

	/**
	 * Returns the weight of the minimum spanning tree.
	 * 
	 * @return Weight of the minimum spanning tree.
	 */
	public double getWeight();

	/**
	 * Returns a list of CyEdges constituting the minimum spanning tree.
	 * 
	 * @return A list of CyEdges constituting the minimum spanning tree.
	 */
	public Iterable<CyEdge> getMST();
}
