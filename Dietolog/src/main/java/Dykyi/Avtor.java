package Dykyi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

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

	public Avtor(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		Label_NazvaEmblema = new JLabel("ДІЄТОЛОГ");
		Label_NazvaEmblema.setForeground(new Color(0, 0, 0));
		Label_NazvaEmblema.setFont(new Font("Monotype Corsiva", Font.BOLD, 55));
		Label_NazvaEmblema.setHorizontalAlignment(SwingConstants.CENTER);
		Label_NazvaEmblema.setBounds(12, 13, 1250, 99);
		getContentPane().add(Label_NazvaEmblema);

		label_Login = new JLabel("Логін");
		label_Login.setHorizontalAlignment(SwingConstants.CENTER);
		label_Login.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		label_Login.setBounds(138, 193, 231, 29);
		getContentPane().add(label_Login);

		textField_Login = new JTextField();
		textField_Login.setToolTipText("");
		textField_Login.setText("1");
		textField_Login.setBounds(138, 245, 231, 36);
		getContentPane().add(textField_Login);
		textField_Login.setColumns(10);

		label_Password = new JLabel("Пароль");
		label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		label_Password.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		label_Password.setBounds(140, 338, 231, 29);
		getContentPane().add(label_Password);

		passwordField_Password = new JPasswordField();
		passwordField_Password.setToolTipText("");
		passwordField_Password.setText("1");
		passwordField_Password.setBounds(138, 391, 231, 36);
		getContentPane().add(passwordField_Password);

		b_Yvijtu = new JButton("Увійти");
		b_Yvijtu.addActionListener(new ActionListener() {
			private String s_Login;
			private String s_Password;

			private Scanner scanner_Avtoruzacia;
			private String s_Avtoruzacia;

			String[][] Reading = new String[1][4];
			String Reading1;

			@SuppressWarnings("deprecation")

			public void actionPerformed(ActionEvent arg0) {
				s_Login = textField_Login.getText();
				s_Password = passwordField_Password.getText();

				try {
					scanner_Avtoruzacia = new Scanner(new File("res/Avtoruzacia/" + s_Login + ".txt"));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Помилка введення");
				}

				while (scanner_Avtoruzacia.hasNext()) {
					for (int row = 0; row < Reading.length; row++) {
						Reading1 = " ";

						for (int col = 0; col < Reading[row].length; col++) {
							Reading[row][col] = scanner_Avtoruzacia.next();
							if (col == 0) {
								Reading1 = Reading[row][col];
							}
						}
					}
				}
				s_Avtoruzacia = Reading1;
				System.out.println(s_Avtoruzacia);
				scanner_Avtoruzacia.close();

				if (s_Password.equals(s_Avtoruzacia)) {
					JOptionPane.showMessageDialog(null, "Вітаю, Ви в системі");
					new Menu("Дієтолог");
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Помилка введення");
					passwordField_Password.setText("");
				}

			}
		});
		b_Yvijtu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Yvijtu.setBounds(138, 490, 231, 36);
		getContentPane().add(b_Yvijtu);

		b_Reestracia = new JButton("Реєстрація");
		b_Reestracia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Reestrasia("Дієтолог");
				setVisible(false);
			}
		});
		b_Reestracia.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Reestracia.setBounds(138, 525, 231, 36);
		getContentPane().add(b_Reestracia);

		setVisible(true);
	}
}
