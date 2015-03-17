/**
 * 
 */
package org.cytoscape.cyGraph.centralities.api;

import java.util.Map;

import org.cytoscape.model.CyEdge;
import org.cytoscape.model.CyNode;

/**
 * Provides methods to get the centralities measures once all of them have been
 * computed.
 * 
 * @author Jimmy
 * 
 */
public interface NetworkStatsResults {

	/**
	 * Returns the node betweenness map i.e. a map from CyNode to betweenness
	 * value.
	 * 
	 * @return Map : (CyNode) -> (Betweenness)
	 */
	public Map<CyNode, Double> getBetweennessMap();

	/**
	 * Returns the node closenness map i.e. a map from CyNode to closeness
	 * value.
	 * 
	 * @return Map : (CyNode) -> (Closeness)
	 */
	public Map<CyNode, Double> getClosenessMap();

	/**
	 * Returns the node clustering coefficient map i.e. a map from CyNode to
	 * clustering coefficient value.
	 * 
	 * @return Map : (CyNode) -> (Clustering coefficient)
	 */
	public Map<CyNode, Double> getClusteringCoefficientMap();

	/**
	 * Returns the diameter of CyNetwork.
	 * 
	 * @return Diameter
	 */
	public double getDiameter();

	/**
	 * Returns the node eccentricity map i.e. a map from CyNode to eccentricity
	 * value.
	 * 
	 * @return Map : (CyNode) -> (Eccentricity)
	 */
	public Map<CyNode, Double> getEccentricityMap();

	/**
	 * Returns the edge betweenness map i.e. a map from CyEdge to betweenness
	 * value.
	 * 
	 * @return Map : (CyEdge) -> (Betweenness)
	 */
	public Map<CyEdge, Double> getEdgeBetweennessMap();

	/**
	 * Returns the node eccentricity map i.e. a map from CyNode to eccentricity
	 * value.
	 * 
	 * @return Map : (CyNode) -> (Eccentricity)
	 */
	public Map<CyNode, Double> getRadialityMap();

	/**
	 * Returns the node stress map i.e. a map from CyNode to stress value.
	 * 
	 * @return Map : (CyNode) -> (Stress)
	 */
	public Map<CyNode, Double> getStressMap();

}
