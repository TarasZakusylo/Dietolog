package Dykyi;

import javax.swing.JFrame;

public class Menu extends JFrame{
 
	private static final long serialVersionUID = 1L;

	public Menu(String s) {
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(1280,720);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	getContentPane().setLayout(null);
    	
    	
    	
    	setVisible(true);
	}

}
