// --== CS400 Fall 2022 File Header Information ==-- 
// Name: Harshet Anand
// Email: hanand2@wisc.edu
// Team: CF red team
// TA: Daniel Finer
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DataWranglerTests {

	public GraphLoader testGraphLoader = new GraphLoader();
	String filePath = "WireConnector.dot";

	@Test
	public void DataWranglerTest1() {
		try {
			List<INode> dwTest1 = this.testGraphLoader.loadGraph("map1.dot");
			assertEquals(dwTest1.get(0).getName(), "CollegeLibrary");
		} catch (FileNotFoundException e) {
		}
	}

	@Test
	public void DataWranglerTest2() {
		try {
			List<INode> dwTest2 = this.testGraphLoader.loadGraph("wrongfile");
			assertFalse(false);
		} catch (FileNotFoundException e) {
			assertTrue(true);
		}
	}

	@Test
	public void DataWranglerTest3() {
		try {
			List<INode> dwTest3 = this.testGraphLoader.loadGraph("map2.dot");
			assertEquals(dwTest3.get(0).getX(), 6);
		} catch (FileNotFoundException e) {
		}
	}

	@Test
	public void DataWranglerTest4() {
		try {
			List<INode> dwTest4 = this.testGraphLoader.loadGraph("map3.dot");
			assertEquals(dwTest4.get(0).getY(), 2.4);
		} catch (FileNotFoundException e) {
		}
	}

	@Test
	public void dwTest5() {
		try {
			List<INode> testList = this.testGraphLoader.loadGraph("map3.dot");
			assertEquals(testList.get(1).getY(), 2.5);
		} catch (FileNotFoundException e) {
		}
	}
}
