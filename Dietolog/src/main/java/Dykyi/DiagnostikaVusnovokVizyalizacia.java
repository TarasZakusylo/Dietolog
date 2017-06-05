package Dykyi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DiagnostikaVusnovokVizyalizacia extends JFrame {

	private static final long serialVersionUID = 1L;

	public DiagnostikaVusnovokVizyalizacia() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Menu = new JButton("Меню");
		b_Menu.setForeground(new Color(255, 140, 0));
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Дієтолог");
				setVisible(false);
			}
		});
		b_Menu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Menu.setBounds(115, 470, 386, 49);
		getContentPane().add(b_Menu);

		setVisible(false);

	}

}
