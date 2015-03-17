/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNode;

/**
 * Provides method to get the pagerank value of a node.
 * 
 * @author Jimmy
 * 
 */
public interface PagerankResults {

	/**
	 * Returns the pagerank of a given CyNode.
	 * 
	 * @param node
	 * @return Pagerank
	 */
	public double getPagerank(CyNode node);

}
