/**
 * <p><i>Created on: 03/07/16</i></p>
 *
 * @author vasvass
 */
public final class HourlyWorker extends Employee {
   private double wage;   // wage per hour
   private double hours;  // hours for a week

  // constructor for class HourlyWorker
  public HourlyWorker(String first, String last, double wagePerHour, double hoursWorked) {

      super(first,last); // call superclass constructor
      setWage(wagePerHour);
      setHours(hoursWorked);
  }

  //Set the wage
  public void setWage (double wagePerHour) {

     wage = ( wagePerHour > 0 ? wagePerHour: 0 );
  }

  //Set the hours
  public void setHours (double hoursWorked) {

      hours = (hoursWorked >= 0 && hoursWorked < 168 ? hoursWorked: 0);
  }

  // Get the HourlyWorkers pay
  public double earnings() {

     return wage * hours;
  }

  public String toString() {

     return "Hourly worker: " + super.toString();

  }

}
