class Circumference extends ConsoleProgram {

  /**
  * this code calculates the circuference of a circle from the set radius from the user
  * @author: Savio. T2q
  */
  
  public void run() {
     // declare variables
     double dblRadius;
     double dblCircumference;

    // recieve input
    dblRadius = readDouble("What is the Radius? ");

    // calculate input into output
    dblCircumference = 2 * Math.PI * dblRadius;

    // output
    System.out.println("The circumference of the circle with the radius of " + dblRadius + " is " + dblCircumference);
  }
}