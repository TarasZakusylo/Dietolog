package Dykyi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Avtor extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel Label_NazvaEmblema;
	private JLabel label_Login;
	private JTextField textField_Login;
	private JLabel label_Password;
	private JPasswordField passwordField_Password;
	private JButton b_Yvijtu;
	private JButton b_Reestracia;

	private JLabel l_fon;

	public Avtor(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		Label_NazvaEmblema = new JLabel("ДІЄТОЛОГ");
		Label_NazvaEmblema.setForeground(Color.MAGENTA);
		Label_NazvaEmblema.setFont(new Font("Monotype Corsiva", Font.BOLD, 55));
		Label_NazvaEmblema.setHorizontalAlignment(SwingConstants.CENTER);
		Label_NazvaEmblema.setBounds(12, 13, 686, 99);
		getContentPane().add(Label_NazvaEmblema);

		label_Login = new JLabel("Логін");
		label_Login.setForeground(Color.MAGENTA);
		label_Login.setHorizontalAlignment(SwingConstants.CENTER);
		label_Login.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		label_Login.setBounds(64, 125, 231, 29);
		getContentPane().add(label_Login);

		textField_Login = new JTextField();
		textField_Login.setToolTipText("");
		textField_Login.setText("1");
		textField_Login.setBounds(64, 177, 231, 36);
		getContentPane().add(textField_Login);
		textField_Login.setColumns(10);

		label_Password = new JLabel("Пароль");
		label_Password.setForeground(Color.MAGENTA);
		label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		label_Password.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		label_Password.setBounds(66, 270, 231, 29);
		getContentPane().add(label_Password);

		passwordField_Password = new JPasswordField();
		passwordField_Password.setToolTipText("");
		passwordField_Password.setText("1");
		passwordField_Password.setBounds(64, 312, 231, 36);
		getContentPane().add(passwordField_Password);

		b_Yvijtu = new JButton("Увійти");
		b_Yvijtu.setForeground(Color.ORANGE);
		b_Yvijtu.addActionListener(new ActionListener() {
			private String s_Login;
			private String s_Password;

			private Scanner scanner_Avtoruzacia;
			private String s_Avtoruzacia;

			String[][] Reading = new String[1][4];
			private String Reading_Password;
			private String Reading_Name;
			private String Reading_Prizvusko;
			private Formatter formatter_RobocuyProfil;

			@SuppressWarnings("deprecation")

			public void actionPerformed(ActionEvent arg0) {
				s_Login = textField_Login.getText();
				s_Password = passwordField_Password.getText();

				try {
					scanner_Avtoruzacia = new Scanner(new File("res/Avtoruzacia/" + s_Login + ".txt"));

					while (scanner_Avtoruzacia.hasNext()) {
						for (int row = 0; row < Reading.length; row++) {
							Reading_Password = " ";
							Reading_Name = " ";
							Reading_Prizvusko = " ";
							for (int col = 0; col < Reading[row].length; col++) {
								Reading[row][col] = scanner_Avtoruzacia.next();
								if (col == 0) {
									Reading_Password = Reading[row][col];
								}
								if (col == 1) {
									Reading_Name = Reading[row][col];
								}
								if (col == 2) {
									Reading_Prizvusko = Reading[row][col];
								}

							}
						}
					}
					s_Avtoruzacia = Reading_Password;
					scanner_Avtoruzacia.close();

					if (s_Password.equals(s_Avtoruzacia)) {
						JOptionPane.showMessageDialog(null, "Вітаю, Ви в системі");

						String s_Korustuvac = Reading_Name + " " + Reading_Prizvusko;

						try {
							formatter_RobocuyProfil = new Formatter("res/TumcasoviFaylu/Korustuvac.txt");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "System Error");
						}
						formatter_RobocuyProfil.format(s_Korustuvac);
						formatter_RobocuyProfil.close();

						new Menu("Дієтолог");
						setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "Помилка введення");
						passwordField_Password.setText("");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Помилка введення");
				}
			}
		});
		b_Yvijtu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Yvijtu.setBounds(64, 391, 231, 36);
		getContentPane().add(b_Yvijtu);

		b_Reestracia = new JButton("Реєстрація");
		b_Reestracia.setForeground(Color.ORANGE);
		b_Reestracia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Reestrasia("Дієтолог");
				setVisible(false);
			}
		});
		b_Reestracia.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Reestracia.setBounds(64, 457, 231, 36);
		getContentPane().add(b_Reestracia);

		l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("res/fon/Avtor.jpg"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
