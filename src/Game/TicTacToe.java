package Game;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class TicTacToe extends JFrame {
	JPanel p=new JPanel();
	ShowButtons buttons[]=new ShowButtons[9];
	
	public static void main(String args[]) {
		new TicTacToe();	
	}
	
	public TicTacToe() {
		//Setting up the JPanel
		super("TicTacToe");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3,3));
		//Adding the Buttons from showButtons to the panel
		for(int i=0; i<9; i++) {
			buttons[i]=new ShowButtons();
			p.add(buttons[i]);
		}
		//Adding the panel to the JFrame
		add(p);
		
		setVisible(true);
	}

	
}
