package Dykyi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_fon;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Diagnistika = new JButton("Діагностика");
		b_Diagnistika.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Diagnistika.setForeground(new Color(255, 140, 0));
		b_Diagnistika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Diagnostika("Дієтолог");
				setVisible(false);
			}
		});
		b_Diagnistika.setBounds(12, 55, 282, 42);
		getContentPane().add(b_Diagnistika);

		JButton b_Likyvanna = new JButton("Лікування");
		b_Likyvanna.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Likyvanna.setForeground(new Color(255, 140, 0));
		b_Likyvanna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Likyvanna("Дієтолог");
				setVisible(false);
			}
		});
		b_Likyvanna.setBounds(12, 140, 282, 42);
		getContentPane().add(b_Likyvanna);

		JButton b_Vegeterianstvo = new JButton("Вегетеріанство");
		b_Vegeterianstvo.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Vegeterianstvo.setForeground(new Color(255, 140, 0));
		b_Vegeterianstvo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vegeterianstvo("Дієтолог");
				setVisible(false);
			}
		});
		b_Vegeterianstvo.setBounds(12, 235, 282, 42);
		getContentPane().add(b_Vegeterianstvo);

		JButton b_PerioduRozvutku = new JButton("Періоди розвитку");
		b_PerioduRozvutku.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_PerioduRozvutku.setForeground(new Color(255, 140, 0));
		b_PerioduRozvutku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PerioduRozvutku("Дієтолог");
				setVisible(false);
			}
		});
		b_PerioduRozvutku.setBounds(12, 324, 282, 42);
		getContentPane().add(b_PerioduRozvutku);

		JButton b_Racion = new JButton("Раціон");
		b_Racion.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Racion.setForeground(new Color(255, 140, 0));
		b_Racion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Racion("Дієтолог");
				setVisible(false);
			}
		});
		b_Racion.setBounds(12, 407, 282, 42);
		getContentPane().add(b_Racion);

		JButton b_ZvernennaDoLakara = new JButton("Звернення до лікаря");
		b_ZvernennaDoLakara.setFont(new Font("Times New Roman", Font.ITALIC, 29));
		b_ZvernennaDoLakara.setForeground(new Color(255, 140, 0));
		b_ZvernennaDoLakara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ZvernennaDoLakara("Дієтолог");
				setVisible(false);
			}
		});
		b_ZvernennaDoLakara.setBounds(12, 486, 282, 42);
		getContentPane().add(b_ZvernennaDoLakara);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/fon/Menu1.jpg"));
		label.setBounds(294, 54, 700, 511);
		getContentPane().add(label);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
