package tiy.pink;

import java.util.Scanner;

/**
 * Created by jessicatracy on 8/24/16.
 */
public class ChocolateSolver {

    public static void main(String[] args) {
        ChocolateSolver mySolver = new ChocolateSolver();
        System.out.println("Chocolate Runner running....");

        mySolver.playGame();
    }

    public void playGame() {
        String userInput = "y";
        Scanner myScanner = new Scanner(System.in);

        while (userInput.equalsIgnoreCase("y")) {
            System.out.print("How many big blocks of chocolate do you have? ");
            int big = myScanner.nextInt();
            myScanner.nextLine();

            System.out.print("How many small blocks of chocolate do you have? ");
            int small = myScanner.nextInt();
            myScanner.nextLine();

            System.out.print("How much chocolate are you trying to make? ");
            int goal = myScanner.nextInt();
            myScanner.nextLine();

            int[] arraySmallBig = makeChocolate2(small, big, goal);

            boolean check = checkIfYouHaveChocolate(arraySmallBig);

            if (check) {
                drawMyChocolate(arraySmallBig);
            }

            System.out.println("Would you like to play again? (y/n)");
            userInput = myScanner.nextLine();
        }

    }

    public void drawMyChocolate(int[] arraySmallBig) {
        System.out.println("We used " + arraySmallBig[0] + " small blocks");
        if (arraySmallBig[0] == 0) {
            printTheX();
        } else {
            for (int counter = 0; counter < arraySmallBig[0]; counter++) {
                System.out.print("---------    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[0]; counter++) {
                System.out.print("|       |    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[0]; counter++) {
                System.out.print("---------    ");
            }
            System.out.println();

        }
        System.out.println("We used " + arraySmallBig[1] + " big blocks");
        if (arraySmallBig[1] == 0) {
            printTheX();
        } else {
            for (int counter = 0; counter < arraySmallBig[1]; counter++) {
                System.out.print("---------    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[1]; counter++) {
                System.out.print("|       |    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[1]; counter++) {
                System.out.print("|       |    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[1]; counter++) {
                System.out.print("|       |    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[1]; counter++) {
                System.out.print("|       |    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[1]; counter++) {
                System.out.print("|       |    ");
            }
            System.out.println();
            for (int counter = 0; counter < arraySmallBig[1]; counter++) {
                System.out.print("---------    ");
            }
            System.out.println();
        }
    }

    public void printTheX() {
        System.out.println("\\      /");
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
        System.out.println("   /\\");
        System.out.println("  /  \\  ");
        System.out.println(" /    \\  ");
        System.out.println("/      \\  ");
    }

    public boolean checkIfYouHaveChocolate(int[] arraySmallBig) {
        if (arraySmallBig[0]  == -1) {
            System.out.println("Not enough smalls.... No chocolate for you!");
            return false;
        } else {
            System.out.println("Yay! You have chocolate!");
            return true;
        }
    }

    //Returns number of smalls
    public int makeChocolate(int small, int big, int goal) {
        if (small < 0 || big < 0 || goal < 0) {
            return -1;
        } else {
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

    //Returns number of smalls AND number of bigs
    public int[] makeChocolate2(int small, int big, int goal) {
        int[] returnArraySmallBig = new int[2];
        if (small < 0 || big < 0 || goal < 0) {
            returnArraySmallBig[0] = -1;
            returnArraySmallBig[1] = -1;
        } else {
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
        }
        return returnArraySmallBig;
    }
}
