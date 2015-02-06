package dataEntry;

import javax.swing.*;

import java.awt.*;

public class Window {
	private static void createAndShowGUI(){
		JFrame positionEntry = new JFrame("Position Entry");
		GridLayout testLayout = new GridLayout(0,4);
		positionEntry.setLayout(testLayout);
		JTextField xPosition = new JTextField(10);
		JTextField yPosition = new JTextField(10);
		JTextField zPosition = new JTextField(10);
		JTextField yaw = new JTextField(10);
		JTextField pitch = new JTextField(10);
		JTextField roll = new JTextField(10); 
		positionEntry.add(xPosition);
		positionEntry.add(yPosition);
		positionEntry.add(zPosition);
		positionEntry.add(yaw);
		positionEntry.add(pitch);
		positionEntry.add(roll);
		positionEntry.add(new JButton("Submit"));

		positionEntry.setVisible(true);
	}
	
	public static void main(String[] args){
		createAndShowGUI();
	}

}
