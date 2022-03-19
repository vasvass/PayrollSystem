/**
 * <p><i>Created on: 03/07/16</i></p>
 *
 * @author vasvass
 */
public abstract class Employee {

  private String firstName;
  private String lastName;


  //Constructor
  public Employee(String first, String last) {

     firstName = first;
     lastName = last;
  }

  //getters
  public String getFirstName() {

      return firstName;
  }

  public String getLastName() {

      return lastName;
  }

  public String toString() {

      return firstName + ' ' + lastName;
  }

  public abstract double earnings();


}
