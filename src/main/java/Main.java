import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // This program calculates the area and preimeter of a hexagon.  The user inputs the length of one side of the hexagon and the program calculates the area and perimeter and prints it to the screan.
    
    System.out.println("This program will calculate the area of a hexagon and the primeter.  Enter the length of the side of the hexagon: \n"); 

    //Accepts user input for the length of one side of the hexagon.
    double s = input.nextDouble();

    //I simplfied the formula for the area of a hexagon to the side length squared times 2.598076.  However, this is how you would code the formula as given in the instructions:  6*Math.pow(s,2)/(4*Math.tan(Math.PI/6)).  The below code is much simpler and it works.
    
    double area = Math.pow(s, 2) * 2.598076;

    //Calculates the perimeter of the hexagon.
    
    double perimeter = s * 6;

    System.out.printf("\nThe area of the hexagon is: %.2f", area,     " and the perimeter is: ", perimeter);
    
    System.out.println(" \n\nThe length of the perimeter of the hexagon is: " + perimeter);

    


    
  }

  
}