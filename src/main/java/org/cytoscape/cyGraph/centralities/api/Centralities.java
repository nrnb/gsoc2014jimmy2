/**
 * 
 */
package org.cytoscape.cyGraph.centralities.api;

import java.util.List;
import java.util.Map;

import org.cytoscape.cyGraph.algorithms.api.WeightFunction;
import org.cytoscape.model.CyIdentifiable;
import org.cytoscape.model.CyNetwork;
import org.cytoscape.model.CyNode;

/**
 * Centralities provides access to a number of centrality measures for directed,
 * undirected, weighted and unweighted network or graph.
 * 
 * @author Jimmy
 * 
 */
public interface Centralities {

	/**
	 * Computes all the centrality measures.
	 * 
	 * @param network
	 *            The CyNetwork for which the user wants to compute centrality
	 *            measures.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return
	 */
	public NetworkStatsResults computeAll(CyNetwork network, boolean directed,
			WeightFunction function);

	/**
	 * Computes node, edge betweenness and node stress and returns a Map from
	 * CyNode -> (Betweenness, Stress) and CyEdge -> (Betweenness)
	 * 
	 * @param network
	 *            The CyNetwork for which the user wants to compute node, edge
	 *            betweenness and node stress.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @return Map of CyNode -> (Betweenness, Stress), CyEdge -> (Betweenness)
	 */
	public Map<CyIdentifiable, List<Double>> getBetweennessStress(
			CyNetwork network, boolean directed);

	/**
	 * Computes the closeness centrality of a given CyNode.
	 * 
	 * @param network
	 *            The CyNetwork containing the node for which the user wants to
	 *            compute the closeness measure.
	 * @param node
	 *            The CyNode for which the user wants to compute the closeness
	 *            measure.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * 
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return The closeness value of the node.
	 */
	public double getCloseness(CyNetwork network, CyNode node,
			boolean directed, WeightFunction function);

	/**
	 * Computes the clustering coefficient of a given CyNode.
	 * 
	 * @param network
	 *            The CyNetwork containing the node for which the user wants to
	 *            compute the clustering coefficient.
	 * @param node
	 *            The CyNode for which the user wants to compute the clustering
	 *            coefficient.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @return The clustering coefficient value of node.
	 */
	public double getClusteringCoefficient(CyNetwork network, CyNode node,
			boolean directed);

	/**
	 * Returns the degree centrality of a given node.
	 * 
	 * @param network
	 *            The CyNetwork containing the node for which the user wants to
	 *            compute the degree.
	 * @param node
	 *            The CyNode for which the user wants to compute the degree.
	 * @return The degree.
	 */
	public int getDegree(CyNetwork network, CyNode node);

	/**
	 * Returns the in degree of a given CyNode in a directed CyNetwork.
	 * 
	 * @param network
	 *            The CyNetwork containing the node for which the user wants to
	 *            compute the in-degree.
	 * @param node
	 *            The CyNode for which the user wants to compute the in-degree.
	 * @return The in-degree.
	 */
	public int getIndegree(CyNetwork network, CyNode node);

	/**
	 * Returns the diameter of the CyNetwork
	 * 
	 * @param network
	 *            The CyNetwork for which the user wants to compute the diamter.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return The diameter of the given CyNetwork.
	 */
	public double getDiameter(CyNetwork network, boolean directed,
			WeightFunction function);

	/**
	 * Returns the out degree of a given node in a directed CyNetwork.
	 * 
	 * @param network
	 *            The CyNetwork containing the node for which the user wants to
	 *            compute the out-degree.
	 * @param node
	 *            The CyNode for which the user wants to compute the out-degree.
	 * @return The out-degree.
	 */
	public int getOutdegree(CyNetwork network, CyNode node);

	/**
	 * Computes the eccentricity of a given CyNode.
	 * 
	 * @param network
	 *            The CyNetwork containing the node for which the user wants to
	 *            compute the eccentricity measure.
	 * @param node
	 *            The CyNode for which the user wants to compute the
	 *            eccentricity.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return The eccentricity measure of the node.
	 */
	public double getEccentricity(CyNetwork network, CyNode node,
			boolean directed, WeightFunction function);

	/**
	 * Computes the radiality measure of a given CyNode.
	 * 
	 * @param network
	 *            The CyNetwork containing the node for which the user wants to
	 *            compute the radiality measure.
	 * @param node
	 *            The CyNode for which the user wants to compute the radiality
	 *            measure.
	 * @param directed
	 *            True if the network is to be treated as directed and false
	 *            otherwise.
	 * @param function
	 *            WeightFunction mapping each edge to a weight.
	 * @return The radiality measure of the node.
	 */
	public double getRadiality(CyNetwork network, CyNode node,
			boolean directed, WeightFunction function);
}
