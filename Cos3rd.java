class Cos3rd extends ConsoleProgram {

  /**
  * this code calculates side c of a triangle
  * @author: Savio. T
  */
  
  public void run() {
    // declare variable
    int intSideA;
    int intSideB;
    double dblSideC;
    int intAngleC;

    // recieve input
    intSideA = readInt("What is the length of side A in centimetres? ");
    intSideB = readInt("What is the length of side B in Centimetres? ");
    intAngleC = readInt("What is the angle of angle C in degrees? ");

    // calculate input into output
    dblSideC = Math.sqrt(intSideA * intSideA + intSideB * intSideB - 2 * intSideA * intSideB * Math.cos(intAngleC));

    // output
    System.out.println("Side C of the triangle is " + dblSideC + " centimetres");
    
  }
}