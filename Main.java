import java.util.Scanner;
/**
 * a program that finds the average height of 5 people and the heights that are above average
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in); 

    // ask the user how many heights he would like to enter
    System.out.println("How many heights would you like to enter");
    int heightNum = input.nextInt();

    double[] heights = new double[heightNum]; 

    // ask the user for the heights
    System.out.println("Please enter the heights on separate lines");
    for(int i = 0; i < heightNum; i++){
      heights[i] = input.nextDouble();
    }

    // create a variable to store the sum
    double sum = 0;

    // use a for loop to go threw the array and add sum
    for(int i = 0; i < heightNum; i++){
      // add the height to sum
      sum = sum + heights[i];
    }

    // determine the average
    double average = sum/heights.length;

    // let the user know the average
    System.out.println("The average height is " + average);

    System.out.println("The heights above average are");
    // create a for loop to see which heights are above average
    for(int i = 0; i < heightNum; i++){
    // create an if statement to let the user know the heights above average
    if(average < heights[i]){
      System.out.println(heights[i]);
    }
    }
  }
}
