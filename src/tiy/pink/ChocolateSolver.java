package tiy.pink;

/**
 * Created by jessicatracy on 8/24/16.
 */
public class ChocolateSolver {

    //Returns number of smalls
    public int makeChocolate(int small, int big, int goal) {
        if(small < 0 || big < 0 || goal < 0) {
            return -1;
        }
        int greatestMultipleOfFiveInGoal = goal - (goal % 5);
        int numBigsNeededToMakeGreatestMultipleOfFiveInGoal = greatestMultipleOfFiveInGoal / 5;
        if (big <= numBigsNeededToMakeGreatestMultipleOfFiveInGoal) {
            int smallsNeeded = goal - (5 * big);
            if (small >= smallsNeeded) {
                return smallsNeeded;
            } else {
                return -1;
            }
        } else {
            int smallsNeeded = goal - (5 * numBigsNeededToMakeGreatestMultipleOfFiveInGoal);
            if (small >= smallsNeeded) {
                return smallsNeeded;
            } else {
                return -1;
            }
        }
    }

    //Returns number of smalls AND number of bigs
    public int[] makeChocolate2(int small, int big, int goal) {
        int[] returnArraySmallBig = new int[2];
        if(small < 0 || big < 0 || goal < 0) {
            returnArraySmallBig[0] = -1;
            returnArraySmallBig[1] = -1;
        }
        int greatestMultipleOfFiveInGoal = goal - (goal % 5);
        int numBigsNeededToMakeGreatestMultipleOfFiveInGoal = greatestMultipleOfFiveInGoal / 5;
        if (big <= numBigsNeededToMakeGreatestMultipleOfFiveInGoal) {
            int smallsNeeded = goal - (5 * big);
            if (small >= smallsNeeded) {
                returnArraySmallBig[0] = smallsNeeded;
                returnArraySmallBig[1] = big;
            } else {
                returnArraySmallBig[0] = -1;
                returnArraySmallBig[1] = -1;
            }
        } else {
            int smallsNeeded = goal - (5 * numBigsNeededToMakeGreatestMultipleOfFiveInGoal);
            if (small >= smallsNeeded) {
                returnArraySmallBig[0] = smallsNeeded;
                returnArraySmallBig[1] = numBigsNeededToMakeGreatestMultipleOfFiveInGoal;
            } else {
                returnArraySmallBig[0] = -1;
                returnArraySmallBig[1] = -1;
            }
        }
        return returnArraySmallBig;
    }
}
