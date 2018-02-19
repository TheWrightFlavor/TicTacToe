package Game;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowButtons extends JButton implements ActionListener{
	/*
	The Icons for the program are .png ; make sure they are in the same directory as your .class files.
	*/
	ImageIcon X;
	ImageIcon O;
	byte value=0;
	
	public ShowButtons() {
		//Grabbing images for icons.
		X=new ImageIcon(this.getClass().getResource("x.png"));
		O=new ImageIcon(this.getClass().getResource("o.png"));
		//Adding the action to be performed on button press.
		this.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		value++;
		value%=3;
		
		switch(value) {
		case 0:
			setIcon(null);
			break;
		case 1:
			setIcon(X);
			break;
		case 2:
			setIcon(O);
		}
	}
}
