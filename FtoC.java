class FtoC extends ConsoleProgram {

  /**
  * this code converts fahrenheit to celsius
  * @author: Savio. T
  */
  
  public void run() {
    // declare variables
    double dblF;
    double dblC;
    
    // recieve input
    dblF = readDouble("What is the Fahrenheit being converted into Celsius? ");

    // calculate input into output
    dblC = (5.0 / 9.0) * (dblF - 32);

    // output
    System.out.println(dblF + " Fahrenheit is " + dblC + " celsius ");
  }
}