class Power extends ConsoleProgram {

  /**
  * this code takes one number and raises it to the power of the second number
  * @author: Savio. T
  */
  
  public void run() {
    // declare variables
    double dblBase;
    double dblExp;
    double dblAns;
    
    // recieve input
    dblBase = readDouble("Enter a number as the base: ");
    dblExp = readDouble("Enter the second number which acts as the exponent: ");

    // calculate input into output
    dblAns = Math.pow(dblBase, dblExp);

    // output
    System.out.println(dblBase + " raised to the power of " + dblExp + " equals2 " + dblAns);
  }
}