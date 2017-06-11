package Dykyi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Likyvanna extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JLabel l_fon;
	
	public Likyvanna(String s) {
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(1000,600);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	getContentPane().setLayout(null);
    	
    	JLabel label = new JLabel("Даний функціонал розробляється");
    	label.setHorizontalAlignment(SwingConstants.CENTER);
    	label.setForeground(Color.MAGENTA);
    	label.setFont(new Font("Monotype Corsiva", Font.ITALIC, 50));
    	label.setBounds(105, 113, 764, 60);
    	getContentPane().add(label);
    	
    	JLabel label_1 = new JLabel("Вибачте за тимчасові незручності");
    	label_1.setHorizontalAlignment(SwingConstants.CENTER);
    	label_1.setForeground(Color.MAGENTA);
    	label_1.setFont(new Font("Monotype Corsiva", Font.ITALIC, 50));
    	label_1.setBounds(105, 205, 764, 60);
    	getContentPane().add(label_1);
    	
    	JButton button = new JButton("Меню");
    	button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new Menu("Дієтолог");
				setVisible(false);
    		}
    	});
    	button.setForeground(Color.ORANGE);
    	button.setFont(new Font("Times New Roman", Font.ITALIC, 50));
    	button.setBounds(105, 359, 764, 60);
    	getContentPane().add(button);
    	
		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);
    	
    	setVisible(true);
    	
	}

}
