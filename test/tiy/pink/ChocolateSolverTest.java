package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 8/24/16.
 */
public class ChocolateSolverTest {

        ChocolateSolver solver;

    @Before
    public void setUp() throws Exception {
        solver = new ChocolateSolver();
    }

    @After
    public void tearDown() throws Exception {

    }

//******************************************************************************
//Tests for makeChocolate method
    @Test
    public void testMisc() throws Exception {
        int numSmalls = solver.makeChocolate(12, 5, 19);
        assertEquals(4, numSmalls);
    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(12, 0, 7);
        assertEquals(7, numSmalls);
    }

    @Test
    public void testEnoughBigsNoSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(0, 2, 10);
        assertEquals(0, numSmalls);
    }

    @Test
    public void testNoBigsNoSmallsEquals0() throws Exception {
        int numSmalls = solver.makeChocolate(0, 0, 0);
        assertEquals(0, numSmalls);
    }

    @Test
    public void testNoBigsNoSmallsEquals1() throws Exception {
        int numSmalls = solver.makeChocolate(0, 0, 1);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void enoughBigsEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(9, 3, 19);
        assertEquals(4, numSmalls);
    }

    @Test
    public void negativeBigs() throws Exception {
        int numSmalls = solver.makeChocolate(2, -5, 25);
        assertEquals(-1, numSmalls);
    }


    @Test
    public void negativeBigsWithLargeNumberSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(50, -5, 25);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void negativeSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(-3, 1, 8);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void negativeSmallsWithLargeNumberBigs() throws Exception {
        int numSmalls = solver.makeChocolate(-3, 51, 8);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void moreBigsThanNeededPossible() throws Exception {
        int numSmalls = solver.makeChocolate(3, 4, 12);
        assertEquals(2, numSmalls);
    }

    @Test
    public void moreBigsThanNeededNotPossible() throws Exception {
        int numSmalls = solver.makeChocolate(2, 6, 18);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void enoughSmallsNotEnoughBigsButNotZero() throws Exception {
        int numSmalls = solver.makeChocolate(30, 1, 11);
        assertEquals(6, numSmalls);
    }

    @Test
    public void sameAmountOfSmallsAsBigs() throws Exception {
        int numSmalls = solver.makeChocolate(15, 3, 15);
        assertEquals(0, numSmalls);
    }

    @Test
    public void moreSmallsAndBigsThanGoal() throws Exception {
        int numSmalls = solver.makeChocolate(7, 2, 1);
        assertEquals(1, numSmalls);
    }

    @Test
    public void goalZeroEnoughBigsEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(7, 2, 0);
        assertEquals(0, numSmalls);
    }

    @Test
    public void notEnoughSmallsNotEnoughBigs() throws Exception {
        int numSmalls = solver.makeChocolate(17, 3, 100);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void lotsOfSmallsButCanBeDoneWithBigs() throws Exception {
        int numSmalls = solver.makeChocolate(100, 20, 100);
        assertEquals(0, numSmalls);
    }

    @Test
    public void lotsOfSmallsCantBeDoneWithOnlyBigs() throws Exception {
        int numSmalls = solver.makeChocolate(75, 2, 70);
        assertEquals(60, numSmalls);

    }

    @Test
    public void lotsOfSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(75, 0, 70);
        assertEquals(70, numSmalls);
    }

    @Test
    public void exactNumberWorks() throws Exception {
        int numSmalls = solver.makeChocolate(5, 4, 25);
        assertEquals(5, numSmalls);
    }

    @Test
    public void notEnoughBigsAlmostEnoughSmall() throws Exception {
        int numSmalls = solver.makeChocolate(6, 7, 42);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void exampleTestFromSite1() throws Exception {
        int numSmalls = solver.makeChocolate(4, 1, 9);
        assertEquals(4, numSmalls);
    }

    @Test
    public void exampleTestFromSite2() throws Exception {
        int numSmalls = solver.makeChocolate(4, 1, 10);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void exampleTestFromSite3() throws Exception {
        int numSmalls = solver.makeChocolate(4, 1, 7);
        assertEquals(2, numSmalls);
    }

//******************************************************************************
//Tests for makeChocolate2 method
//    @Test
//    public void testMisc() throws Exception {
//        int numSmalls = solver.makeChocolate2(12, 5, 19);
//        assertEquals(4, numSmalls);
//    }
//
//    @Test
//    public void testEnoughSmallsNoBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(12, 0, 7);
//        assertEquals(7, numSmalls);
//    }
//
//    @Test
//    public void testEnoughBigsNoSmalls() throws Exception {
//        int numSmalls = solver.makeChocolate2(0, 2, 10);
//        assertEquals(0, numSmalls);
//    }
//
//    @Test
//    public void testNoBigsNoSmallsEquals0() throws Exception {
//        int numSmalls = solver.makeChocolate2(0, 0, 0);
//        assertEquals(0, numSmalls);
//    }
//
//    @Test
//    public void testNoBigsNoSmallsEquals1() throws Exception {
//        int numSmalls = solver.makeChocolate2(0, 0, 1);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void enoughBigsEnoughSmalls() throws Exception {
//        int numSmalls = solver.makeChocolate2(9, 3, 19);
//        assertEquals(4, numSmalls);
//    }
//
//    @Test
//    public void negativeBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(2, -5, 25);
//        assertEquals(-1, numSmalls);
//    }
//
//
//    @Test
//    public void negativeBigsWithLargeNumberSmalls2() throws Exception {
//        int numSmalls = solver.makeChocolate(50, -5, 25);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void negativeSmalls() throws Exception {
//        int numSmalls = solver.makeChocolate2(-3, 1, 8);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void negativeSmallsWithLargeNumberBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(-3, 51, 8);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void moreBigsThanNeededPossible() throws Exception {
//        int numSmalls = solver.makeChocolate2(3, 4, 12);
//        assertEquals(2, numSmalls);
//    }
//
//    @Test
//    public void moreBigsThanNeededNotPossible() throws Exception {
//        int numSmalls = solver.makeChocolate2(2, 6, 18);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void enoughSmallsNotEnoughBigsButNotZero() throws Exception {
//        int numSmalls = solver.makeChocolate2(30, 1, 11);
//        assertEquals(6, numSmalls);
//    }
//
//    @Test
//    public void sameAmountOfSmallsAsBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(15, 3, 15);
//        assertEquals(0, numSmalls);
//    }
//
//    @Test
//    public void moreSmallsAndBigsThanGoal() throws Exception {
//        int numSmalls = solver.makeChocolate2(7, 2, 1);
//        assertEquals(1, numSmalls);
//    }
//
//    @Test
//    public void goalZeroEnoughBigsEnoughSmalls() throws Exception {
//        int numSmalls = solver.makeChocolate2(7, 2, 0);
//        assertEquals(0, numSmalls);
//    }
//
//    @Test
//    public void notEnoughSmallsNotEnoughBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(17, 3, 100);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void lotsOfSmallsButCanBeDoneWithBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(100, 20, 100);
//        assertEquals(0, numSmalls);
//    }
//
//    @Test
//    public void lotsOfSmallsCantBeDoneWithOnlyBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(75, 2, 70);
//        assertEquals(60, numSmalls);
//
//    }
//
//    @Test
//    public void lotsOfSmallsNoBigs() throws Exception {
//        int numSmalls = solver.makeChocolate2(75, 0, 70);
//        assertEquals(70, numSmalls);
//    }
//
//    @Test
//    public void exactNumberWorks() throws Exception {
//        int numSmalls = solver.makeChocolate2(5, 4, 25);
//        assertEquals(5, numSmalls);
//    }
//
//    @Test
//    public void notEnoughBigsAlmostEnoughSmall() throws Exception {
//        int numSmalls = solver.makeChocolate2(6, 7, 42);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void exampleTestFromSite1() throws Exception {
//        int numSmalls = solver.makeChocolate2(4, 1, 9);
//        assertEquals(4, numSmalls);
//    }
//
//    @Test
//    public void exampleTestFromSite2() throws Exception {
//        int numSmalls = solver.makeChocolate2(4, 1, 10);
//        assertEquals(-1, numSmalls);
//    }
//
//    @Test
//    public void exampleTestFromSite3() throws Exception {
//        int numSmalls = solver.makeChocolate2(4, 1, 7);
//        assertEquals(2, numSmalls);
//    }
}