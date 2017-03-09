package Dykyi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Diagnistika = new JButton("Діагностика");
		b_Diagnistika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Diagnostika("Дієтолог");
				setVisible(false);
			}
		});
		b_Diagnistika.setBounds(24, 31, 303, 42);
		getContentPane().add(b_Diagnistika);

		JButton b_Likyvanna = new JButton("Лікування");
		b_Likyvanna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Likyvanna("Дієтолог");
				setVisible(false);
			}
		});
		b_Likyvanna.setBounds(24, 75, 303, 42);
		getContentPane().add(b_Likyvanna);

		JButton b_Vegeterianstvo = new JButton("Вегетеріанство");
		b_Vegeterianstvo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vegeterianstvo("Дієтолог");
				setVisible(false);
			}
		});
		b_Vegeterianstvo.setBounds(24, 119, 303, 42);
		getContentPane().add(b_Vegeterianstvo);

		JButton b_PerioduRozvutku = new JButton("Періоди розвитку");
		b_PerioduRozvutku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PerioduRozvutku("Дієтолог");
				setVisible(false);
			}
		});
		b_PerioduRozvutku.setBounds(24, 162, 303, 42);
		getContentPane().add(b_PerioduRozvutku);

		JButton b_Racion = new JButton("Раціон");
		b_Racion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Racion("Дієтолог");
				setVisible(false);
			}
		});
		b_Racion.setBounds(24, 205, 303, 42);
		getContentPane().add(b_Racion);
		
		JButton b_ZvernennaDoLakara = new JButton("Звернення до лікаря");
		b_ZvernennaDoLakara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ZvernennaDoLakara("Дієтолог");
				setVisible(false);
			}
		});
		b_ZvernennaDoLakara.setBounds(24, 248, 303, 42);
		getContentPane().add(b_ZvernennaDoLakara);

		setVisible(true);
	}
}
