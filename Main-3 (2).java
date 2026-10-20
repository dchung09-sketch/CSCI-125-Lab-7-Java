/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Lab 7 Problems 1-5
 */

import java.util.Arrays;// This code converts utility methods into strings

public class Main {// This is the main class that would start all of the operations

    // Problem 1: Sum of All Elements
    public static int danielsumArray(int[] integer) {//This code takes inputed integers and the output is a sum of all integers
        int finalnum = 0;// the variable finalnum is set equal to 0
        for (int currentint : integer) {// This process all the components of arrays one by one individually
            finalnum += currentint;// This code adds the value of two integers into the affect of the active "for" statement loop
        }// This is a closing curly bracket statement
        return finalnum;//This line provides the final amount of the variable and the resultant of this problem
    }// This is a closing statement curly bracket

    // Problem 2: Find Maximum Element
    public static int danielfindMax(int[] MaximumElement) {//This line is designed to take the maximum value from an array and the result will be an integer
        int ultra = MaximumElement[0];//This code makes the possibility that the first number within the array is already the maximum number
        for (int realultimate : MaximumElement) {// This process all the components/elements of arrays one by one individually
            if (realultimate > ultra) {// This is an if statement that is testing whether or not the first variable is greater than the second variable
                ultra = realultimate;//If there is a new maximum numerical value, it would be set to the variable ultra
            }// This curly bracket closes the current if statement
        }// This curly bracket ends the current for statement
        return ultra;// The final value of the variable ultra will be the result of this problem
    }// This is a closing curly bracket

    // Problem 3: Sort Array in Ascending Order
    public static int[] danielsortArray(int[] myregularintergers) {// This code takes the integer inputs and the result will be a more particular organized version of those inputs
        Arrays.sort(myregularintergers);// This code takes the integers provided and arranged them to an increasing order to numbers
        return myregularintergers;// This line provided the arranged integers that were organized and the final form provided is an integer
    }// This is a closing statement curly bracket

    // Problem 4: Array Normalization
    public static double[] danielarrayNormalization(int[] keyfigures) {// This line takes integers from an array and then transitions into an array of doubles
        int lastplace = 0;// The integer lastpace is being set to 0
        for (int figuretaxi : keyfigures) {// This process all the components/elements of arrays one by one individually
            lastplace += figuretaxi;//This code adds the value of two integers into the affect of the active "for" statement loop
        }// This is a closing curly bracket
        double[] takingnormalplaces = new double[keyfigures.length];//This double array uses lenghth to normaize it's integers
        for (int d = 0; d < keyfigures.length; d++) {//This line of code starts a loop for each component
            takingnormalplaces[d] = (double) keyfigures[d] / lastplace;// This code diides the values of two variables and stores them as a double value at d
        }// This is a closing bracket for the for statement
        return takingnormalplaces;//This line provided the arranged integers that were organized and the final form provided is an integer
    }

    // Problem 5: Shift Array Elements by One Position
    public static int[] shiftRightByOne(int[] regularintegers) {// This line takes the interers from the array and moves it's components one position to the right
        int[] movingcurrent = new int[regularintegers.length];// This line of code puts the same lenghth for both arrays, thus moving their position to the right
        movingcurrent[0] = regularintegers[regularintegers.length - 1];// This line of code moves the last component of the variables value to the new initial first set of the array
        for (int i = 0; i < regularintegers.length - 1; i++) {//This line of code starts a loop for each component
            movingcurrent[i + 1] = regularintegers[i];// This moves each component one position to the right, starting from the second position
        }// This is a closing curly bracket for the for statement
        return movingcurrent;//This line provided the arranged integers that were organized and the final form provided is an integer
    }// This is the closing curly bracket

    public static void main(String[] args) {// This line of code is utilized to start all arguments
        int[] numericals = {1, 2, 3, 4, 5};// These are the inputs for the first problem within this variable
        int amount = danielsumArray(numericals);// This calls the numericals array into an argument and stores its value into amount
        System.out.println(+amount + " is the overall Sum of All Elements!");// This is the output of the code

        int[] currentvalues = {3, 9, 1, 7, 2};//These are the inputs for the first problem within this variable
        System.out.println(+danielfindMax(currentvalues) + " is the current Maximum Numbers of these Values!");// This is the output for this problem

        int[] labvalues = {5, 1, 4, 2, 8};//These are the inputs for the first problem within this variable
        System.out.println("The new array sorted in ascending order is " + Arrays.toString(danielsortArray(labvalues)) + " ! ");// This line of code is the output for this problem

        int[] reginputs = {1, 2, 3, 4, 5};//These are the inputs for the first problem within this variable
        double[] newoutcome = danielarrayNormalization(reginputs);//This calls the reginputs array into an argument and stores its value into newoutcome

        System.out.print("The Overall Normalized Array of the input numbers are : ");// This line of code provides the message that is depicted while providing the output of the code
        for (int nc = 0; nc < newoutcome.length; nc++) {//This line of code starts a loop for each component
            System.out.printf("%.4f", newoutcome[nc]);// This line of code provides the numerical values of newoutcome[nc] and provides the answer in 4 decimal places per value
            if (nc < newoutcome.length - 1) {// This line of code is an if statement that is questioning if the variable nc is less than newoutcome.length -1
                System.out.print(" , ");// This line of code provides the outcome of this problem by separating each value by a comma
            }// This is the closing bracket for the if statement
        }// This is the closing bracket for the for statement
        System.out.println();// This line of code is there to help and provide the overall final result for this problem moving to the next line

        int[] pandas = {1, 2, 3, 4, 5};//These are the inputs for the first problem within this variable
        int[] majorout = shiftRightByOne(pandas);//This calls the pandas array into an argument and stores its value into majorout


        System.out.print("The Current Shifted Array of the input numbers are : ");//This line of code provides the message that is depicted while providing the output of the code
        for (int printingset : majorout) {//This process all the components/elements of arrays one by one individually
            System.out.print(printingset + " ");// This line of code provides the outcome of this problem by separating each value by spacing
            System.out.print(" , ");
        }// This is a closing bracket for the for statement
        System.out.println(); //This line of code is there to help and provide the overall final result for this problem going to the next line
    }// This is a closing curly bracket
}// This is the closing curly bracket for the entire code



