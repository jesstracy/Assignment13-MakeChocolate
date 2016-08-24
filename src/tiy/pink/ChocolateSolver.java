package tiy.pink;

/**
 * Created by jessicatracy on 8/24/16.
 */
public class ChocolateSolver {

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
}
