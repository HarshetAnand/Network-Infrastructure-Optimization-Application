// --== CS400 Fall 2022 File Header Information ==--
// Name: Harshet Anand
// Email: hanand2@wisc.edu
// Team: CF red team
// TA: Daniel Finer
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import java.util.List;
import java.util.NoSuchElementException;

/**
 * This interface defines getter methods for each node's data attributes and is
 * implemented by classes that represent a node and its associated data.
 */
public interface INode {

	public static final String name = "";
	public static final double xPosition = 0;
	public static final double yPosition = 0;
	public static final int visited = 0;
	public static final List<INode> adjacentNodes = null;

	/**
	 * Returns the name of the building.
	 * 
	 * @return name of the building
	 */
	public String getName();

	/**
	 * Returns the x coordinate of the building.
	 * 
	 * @return x coordinate of the building
	 */
	public double getX();

	/**
	 * Returns the y coordinate of the building.
	 * 
	 * @return y coordinate of the building
	 */
	public double getY();

	/**
	 * Returns the adjacent buildings.
	 * 
	 * @return adjacent buildings
	 */
	public List<INode> getAdjNodes();
}
