class Minutes extends ConsoleProgram {

  /**
  * this code allows you to enter a number of minutes, then will caculate/convert to number of days, hours, and minutes 
  * @author: Savio. T
  */
  
  public void run() {
    // declare variables
    double dblM;
    double dblDay;
    double dblHour;
    double dblMin;

    // recieve input
    dblM = readDouble("Enter any amount of minutes: ");

    // calculate/convert input to output
    dblDay = Math.floor(dblM / 1440);
    dblHour = Math.floor(((dblM / 1440) - dblDay) * 24);
    dblMin = ((((dblM / 1440) - dblDay) * 24) - dblHour) * 60;

    // output

    System.out.println(dblM + " minutes equals " + dblDay + " day(s), " + dblHour + " hour(s) and, " + dblMin + " minute(s).");

  }
}