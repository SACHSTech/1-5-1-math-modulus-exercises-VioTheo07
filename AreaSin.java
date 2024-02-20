class AreaSin extends ConsoleProgram {

  /**
  * this code calculates the area of a triangle
  * @author: Savio. T
  */
  
  public void run() {
     // declare variables
     double dblSideA;
     double dblSideB;
     double dblAngleC;
     double dblArea;

    // recieve input
    dblSideA = readDouble("What is the length of Side A in centimetres? ");
    dblSideB = readDouble("What is the length of Side B in centimetres? ");
    dblAngleC = readDouble("What is the angle of Angle C in radians? ");

    // calculate input into output
    dblArea = (dblSideA * dblSideB * Math.sin(dblAngleC)) / 2;
    
    // output
    System.out.println("The Area of the triangle is " + dblArea + " squared centimetres.");
  }
}