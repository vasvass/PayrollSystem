import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * <p><i>Created on: 03/07/16</i></p>
 *
 * @author vasvass
 */
public class TheSystem {

   public static void main (String args[]) {

      Employee employee; //Superclass reference
      String   output = " ";

     Boss boss = new Boss("Stef", "Karg", 2000.0);

     CommissionWorker commissionWorker = new CommissionWorker("Vas", "Vass", 800.0, 4.0, 150);

     PieceWorker pieceWorker = new PieceWorker("John", "Karl", 3.0, 500);

     HourlyWorker hourlyWorker = new HourlyWorker("Tas", "Kagr", 14.50, 50);

     DecimalFormat  precision2 = new DecimalFormat("0.00");

     // Employee reference to a boss
     employee = boss;

     output += employee.toString() + " earned $" +
      precision2.format(employee.earnings()) + "\n" +
      boss.toString() + " earned $" +
      precision2.format(boss.earnings()) + "\n";

     // Employee reference to a CommissionWorker
     employee = commissionWorker;

     output += employee.toString() + " earned $" +
       precision2.format(employee.earnings()) + "\n" +
       commissionWorker.toString() + " earned $" +
       precision2.format(commissionWorker.earnings()) + "\n";

     // Employee reference to a PieceWorker
     employee = pieceWorker;

     output += employee.toString() + " earned $" +
       precision2.format(employee.earnings()) + "\n" +
       pieceWorker.toString() + " earned $" +
       precision2.format(pieceWorker.earnings()) + "\n";

     // Employee reference to a HourlyWorker
     employee = hourlyWorker;

     output += employee.toString() + " earned $" +
       precision2.format(employee.earnings()) + "\n" +
       hourlyWorker.toString() + " earned $" +
       precision2.format(hourlyWorker.earnings()) + "\n";

     JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphism", JOptionPane.INFORMATION_MESSAGE);

     System.exit(0);

   }
}
