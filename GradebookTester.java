import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook g1,g2;
	@BeforeEach
	void setUp() throws Exception {
		g1=new GradeBook(5);
		g2=new GradeBook(5);
		g1.addScore(40.0);
		g1.addScore(18.0);
		g2.addScore(50.0);
		g2.addScore(22.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1=null;
		g2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("40.0 18.0 "));
		assertTrue(g2.toString().equals("50.0 22.0 "));
		
		assertEquals(2, g1.getScoreSize(),.001);
		assertEquals(2, g2.getScoreSize(),.001);
	}

	@Test
	void testSum() {
		assertEquals(58, g1.sum(), .0001);
		assertEquals(72, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(18, g1.minimum(), .001);
		assertEquals(22, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(40.0, g1.finalScore(),.001);
		assertEquals(50.0, g2.finalScore(),.001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize(),0.1);
		assertEquals(2, g2.getScoreSize(),0.1);
	}

}
