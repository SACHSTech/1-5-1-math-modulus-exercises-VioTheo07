class Hours extends ConsoleProgram {

  /**
  * this code allows you to enter a number of hours and converts it to days and hours
  * @author: Savio. T
  */
  
  public void run() {
    // declare variables
    double dblHours;
    double dblTotDays;
    double dblTotHours;

    // recieve input
    dblHours = readDouble("Enter a number of hours: ");

    // calculate input to output
    dblTotDays = Math.floor(dblHours / 24);
    dblTotHours = ((dblHours / 24) - dblTotDays) * 24;

    // output
    System.out.println(dblHours + " hours equals " + dblTotDays + " day(s) and " + dblTotHours + " hour(s).");
    
  }
}