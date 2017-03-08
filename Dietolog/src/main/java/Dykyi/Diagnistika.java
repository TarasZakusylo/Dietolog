package Dykyi;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Diagnistika extends JFrame{

	public Diagnistika(String s) {
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(1280,720);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	getContentPane().setLayout(null);
    	
    	JLabel lblNewLabel = new JLabel("Пройдіть, будь ласка, опитування");
    	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    	lblNewLabel.setBounds(32, 13, 1230, 36);
    	getContentPane().add(lblNewLabel);
    	
    	
    	
    	setVisible(true);
		
	}
}
