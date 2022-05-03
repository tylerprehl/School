// Demonstrating how Jbutton, FlowLayout, and JTextField 
// can be accessible without your own development work, 
// after the inheritance of JFrame.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Extend_action extends JFrame implements ActionListener {
   private JButton button;
   private FlowLayout layout;
   private JTextField textField;

   // set up GUI and event handling
   public Extend_action()
   {
      super( "Interface Demo" );

      layout = new FlowLayout( );

      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( layout );

      // instantiate button objects
      button = new JButton("Press the Button");
      button.addActionListener( this );

      textField = new JTextField( "", 20 );
      textField.setEditable( false );


      // place buttons in BorderLayout; order not important
      container.add( button );
      container.add( textField);

      setSize( 300, 100);
      setVisible( true );

   } // end constructor BorderLayoutDemo

   // handle button events
   public void actionPerformed( ActionEvent event )
   {
		String FirstNumber;
		String SecondNumber;
		int n1, n2, sum;

		FirstNumber = JOptionPane.showInputDialog("Enter first integer");
		SecondNumber = JOptionPane.showInputDialog("Enter second integer");
		n1 = Integer.parseInt(FirstNumber);
		n2 = Integer.parseInt(SecondNumber);
		sum = n1 + n2;


		DecimalFormat formatter = new DecimalFormat("#,##0.0");

    	textField.setText(formatter.format(sum));

      // re-layout the content pane
      layout.layoutContainer( getContentPane() );
   }

   public static void main( String args[] )
   {
      Extend_action application = new Extend_action();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} 
/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
