/**
 * <p><i>Created on: 03/07/16</i></p>
 *
 * @author vasvass
 */
public final class Boss extends Employee {

  private double weeklySalary;

  //constructor for class boss
  public Boss(String first, String last, double salary) {

      super(first, last); //call superclass constructor
      setWeeklySalary(salary);
  }

   //set Bosse's salary
   public void setWeeklySalary(double salary) {

      weeklySalary = (salary > 0 ? salary: 0);
   }

  //get Boss's pay
  public double earnings() {

      return weeklySalary;
  }

  public String toString() {

      return "Boss: " + super.toString();
  }

}
