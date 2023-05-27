// --== CS400 Fall 2022 File Header Information ==--
// Name: Harshet Anand
// Email: hanand2@wisc.edu
// Team: CF red team
// TA: Daniel Finer
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphLoader implements IGraphLoader {
	public List<INode> loadGraph(String fileName) throws FileNotFoundException {
		List<INode> nodeList = (List<INode>) new ArrayList<INode>();
		try {
			File nodeFile = new File(fileName);
			Scanner scnr = new Scanner(nodeFile);
			scnr.nextLine();
			scnr.nextLine();
			String currentLine;
			while (scnr.hasNextLine()) {
				currentLine = scnr.nextLine();
				if (!(currentLine.isEmpty())) {
					String[] currentLineSplit = currentLine.split("\"");
					if (!(currentLineSplit[0].equals("}"))) {
						int first = currentLineSplit[4].indexOf("=");
						int last = currentLineSplit[4].indexOf("]");
						nodeList.add((INode) new Node(currentLineSplit[1], currentLineSplit[3],
								Integer.parseInt(currentLineSplit[4].substring(first + 1, last))));
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error! The file is not found!");
		}
		return nodeList;
	}
}
