/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNode;

/**
 * Provides methods to get the hub and authority value of a CyNode as computed
 * by HITS.
 * 
 * @author Jimmy
 * 
 */
public interface HITSResults {

	/**
	 * Returns the hub value of a given CyNode.
	 * 
	 * @param node
	 * @return Hub value.
	 */
	public double getHubValue(CyNode node);

	/**
	 * Returns the authority value of a given CyNode.
	 * 
	 * @param node
	 * @return Authority value.
	 */
	public double getAuthorityValue(CyNode node);
}
