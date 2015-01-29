/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE
 */
public class LeapYear {

    /** @param  year to be analyzed
     *  @return true if year is a leap year
     *          false if year is not a leap year
     */
    

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        int year=2000;
        if (year % 400 == 0){
            System.out.printf(year+" is a leap year.");
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.printf(year+" is a leap year.");
        }
        else {
            System.out.printf(year+" is not a leap year.");
        }
    }

}

