package dataEntry;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreateAndShowGUI {
	
	private static void createAndShowGUI(){
		JFrame positionEntry = new JFrame("Position Entry");
		JTextField xPosition = new JTextField(10);
		JTextField yPosition = new JTextField(10);
		JTextField zPosition = new JTextField(10);
		positionEntry.add(xPosition);
		positionEntry.add(yPosition);
		positionEntry.add(zPosition);
		positionEntry.setVisible(true);
	}

}
