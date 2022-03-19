/**
 * <p><i>Created on: 03/07/16</i></p>
 *
 * @author vasvass
 */
public final class PieceWorker extends Employee {
   private double wagePerPiece; //wage per piece output
   private int quantity;


   // constructor for class PieceWorker
  public PieceWorker(String first, String last, Double wage, int numberOfItems) {

     super(first, last);
     setWage(wage);
     setQuantity(numberOfItems);
  }

  // set PieceWorker's wage
  public void setWage(double wage) {

      wagePerPiece = ( wage > 0 ? wage:0);
  }

  // set number of items output
  public void setQuantity (int numberOfItems) {

      quantity = (numberOfItems > 0 ? numberOfItems:0);
  }

  //determine Pieceworker's earnings
  public double earnings() {

     return quantity * wagePerPiece;
  }

  public String toString() {

     return "Piece worker: " + super.toString();
  }


}
