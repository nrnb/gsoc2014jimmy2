/**
 * 
 */
package org.cytoscape.cyGraph.algorithms.api;

import org.cytoscape.model.CyNode;

/**
 * <code>Callback</code> function to be provided by the user.
 * 
 * @author Jimmy
 * 
 */
public interface Callback {

	public boolean notify(CyNode node, int time, int dist);
}
