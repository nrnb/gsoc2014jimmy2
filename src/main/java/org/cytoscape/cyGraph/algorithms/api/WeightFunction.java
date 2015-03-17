/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyEdge;

/**
 * <code>WeightFunction</code> i.e. a map from CyEdge to weight, to be provided by the user when calling a path finder, minimum
 * spanning tree finder, etc.
 * 
 * @author Jimmy
 * 
 */
public interface WeightFunction {

	/**
	 * Returns the weight of CyEdge.
	 * 
	 * @param edge
	 *            CyEdge
	 * @return Weight.
	 */
	public double getWeight(CyEdge edge);
}
