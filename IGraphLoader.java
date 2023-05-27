// --== CS400 Fall 2022 File Header Information ==-- 
// Name: Harshet Anand
// Email: hanand2@wisc.edu
// Team: CF red team
// TA: Daniel Finer
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import java.io.FileNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Instances of this interface can be used to load node data from a DOT file.
 */
public interface IGraphLoader {

	/**
	 * This method loads the list of nodes from a DOT file.
	 * 
	 * @param fileName path
	 * @return a list of node objects
	 * @throws FileNotFoundException
	 */
	List<INode> loadGraph(String fileName) throws FileNotFoundException;
}