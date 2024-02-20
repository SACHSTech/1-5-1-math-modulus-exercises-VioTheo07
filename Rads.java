class Rads extends ConsoleProgram {

  /**
  * this code converts degrees into radians
  * @author: Savio. T
  */
  
  public void run() {
    // declare variables
    int intDegrees;
    double dblRadians;
    
    // recieve input
    intDegrees = readInt("What is the number of degrees? ");

    // calculate input into output
    dblRadians = intDegrees * (Math.PI / 180);

    // output
    System.out.println(intDegrees + " degrees is " + dblRadians + " radians");
  }
}