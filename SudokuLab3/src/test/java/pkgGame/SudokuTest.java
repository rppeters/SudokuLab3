package pkgGame;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {
	
	private int[][] solvedPuzzle = {{5,3,4,6,7,8,9,1,2},
			{6,7,2,1,9,5,3,4,8},
			{1,9,8,3,4,2,5,6,7},
			{8,5,9,7,6,1,4,2,3},
			{4,2,6,8,5,3,7,9,1},
			{7,1,3,9,2,4,8,5,6},
			{9,6,1,5,3,7,2,8,4},
			{2,8,7,4,1,9,6,3,5},
			{3,4,5,2,8,6,1,7,9}};
	
	@Test
	public void Sudoku_Test1() {

		try {
			Sudoku s1 = new Sudoku(9);
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test(expected = Exception.class)
	public void Sudoku_Test2() throws Exception {

		Sudoku s1 = new Sudoku(10);

	}

	@Test
	public void getRegion_Test1() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 3, 4, 1, 2 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region 0 = 1 2 3 4
		// region 1 = 3 4 1 2

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(1);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}
	
	@Test
	public void getRegion_Test2() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 2, 1, 4, 3 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region at 0,2 = 2 1 4 3

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(0,2);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}
	
	@Test
	public void Sudoku_test1()
	{
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test2()
	{
		int[][] puzzle = { { 5, 5, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test3()
	{
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 5, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 5, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test4()
	{
		int[][] puzzle = { 
				{ 55, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	
	
	@Test
	public void PartialSudoku_Test1()
	{
		//	This test will test a partial sudoku...  a zero in [0,0]...  everything else works
		//	but the first element in the puzzle is zero 
		
		int[][] puzzle = { { 0, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void PartialSudoku_Test2()
	{
		//	This test will test a partial sudoku...  
		//	Everything zero, but there's a duplciate value in the region (not row/column)
 
		
		int[][] puzzle = {
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	
	@Test
	public void PartialSudoku_Test3()
	{
		//	This is a working solution, make sure it fails isPartiaSudoku()
		
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	
	
	@Test 
	public void getRegionNbr_Test() throws Exception {
		int[][] puzzle = {{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}};
		
		Sudoku s1 = new Sudoku(puzzle);
		int reg2 = s1.getRegionNbr(1, 3);
		assertEquals(2, reg2);
		
		int reg1 = s1.getRegionNbr(3, 0);
		assertEquals(1, reg1);
		
		int[][] puzzle3x3 = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		
		Sudoku s2 = new Sudoku(puzzle3x3);
		int reg7 = s2.getRegionNbr(4, 6);
		assertEquals(7, reg7);
		
	}
	
	@Test
	public void FillDiagonalRegions_Test() throws Exception {
		
		int[][] emptyPuzzle = {{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
		
		Sudoku s1 = new Sudoku(emptyPuzzle);
		s1.FillDiagonalRegions();
		s1.PrintPuzzle();
		
		int[][] emptyPuzzle3x3 = {{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}};
		
		Sudoku s2 = new Sudoku(emptyPuzzle3x3);
		s2.FillDiagonalRegions();
		s2.PrintPuzzle();
	}
	
	@Test
	public void SetRegion_Test() throws Exception {
		Sudoku s = new Sudoku(solvedPuzzle);
		
		s.SetRegion(0);
		
		//System.out.println("REGION TEST" + Arrays.toString(s.getRegion(0)));
	}
	
	
	@Test 
	public void shuffleArray_Test( ) throws Exception{
		int[][] puzzle = {{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}};
		
		Sudoku s1 = new Sudoku(puzzle);
		int[] myArr = {1,2,3,4};
		s1.shuffleArray(myArr);
		
		//System.out.println("SHUFFLE" + Arrays.toString(myArr));
		
	}
	
	@Test
	public void ShuffleRegion_Test() throws Exception {
		int[][] puzzle = {{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}};
		Sudoku s1 = new Sudoku(puzzle);
		s1.ShuffleRegion(0);
		
		System.out.println("SHUFFLE REGION");
		s1.PrintPuzzle();
		
		System.out.println("SHUFFLE REGION");
	
	}
	
	
	
	
	
	
}
